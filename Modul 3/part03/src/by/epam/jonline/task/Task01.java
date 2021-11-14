package by.epam.jonline.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//добавляется доп элемент в массив слов в первое предложение абзаца (из за 4 пробелов) (исправить регуляроное выражение)

/*
1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.
 */
public class Task01 {
    public static void main(String[] args) {
        String text;
        text =
                "    При входе сразу же все внимание обращается на деревья. В смешанном лесу можно увидеть:\n"
                        + "величественные дубы, стройные сосны и пирамидальные ели. Очень красиво смотрятся белые березы, они\n"
                        + "всегда радостно шелестят листочками на ветру. Под деревьями кругом растут кустарники. Все растения\n"
                        + "тянутся вверх, поближе к свету и солнцу.\n"
                        + "    Лес летом очень богат разнообразной растительностью. Кругом высокая трава. Особенно приятно\n"
                        + "найти солнечную поляну, которая вся в цветах: клевера, ромашки, гвоздики, кашек. Много цветущих\n"
                        + "лекарственных растений - это зверобой, душица, тысячелистник. А можно наткнуться на такое место,\n"
                        + "где кругом краснеют ягоды земляники. Нужно только не лениться, чтобы ее собрать. В густых зарослях\n"
                        + "встречается черника.\n"
                        + "    Лес прекрасен в любое время года, но особенно летом. Когда заходишь в него, то сразу же меняется\n"
                        + "настроение, становится легче дышать. В знойную погоду чувствуется приятная прохлада, в холодный день\n"
                        + "наоборот нагревшиеся стволы деревьев, отдают свое тепло.\n";

        workWithText(text);

    }

    public static void workWithText(String text) {
        System.out.println("Выберите один из пунктов меню:\n"
                + "1. Сортировка текста по количеству предложений в абзацах.\n"
                + "2. Сортировка слов по длине.\n"
                + "3. Сортировка предложений по количеству вхождений определенной буквы, а в случае равенства - по алфавиту.\n"
                + "4. Выход из приложения.");
        String a = "выбор пользователя";
        while (!a.equalsIgnoreCase("4")) {
            a = enterFromConsole("Выберите номер меню >>");
            switch (a) {
                case "1":
                    sortParagraphByCountOfSentences(text);
                    break;
                case "2":
                    sortWordByLength(text);
                    break;
                case "3":
                    sortWordByCountLexems(text);
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Не верно выбран пункт меню, повторите выбор");
            }
        }
    }

    public static String[] masWithParagraphs(String str) {
        //создадим массив с абзацами текста
        String regexParagraph = "(?m)(?=^\\s{4})";
        String[] paragraphs = str.split(regexParagraph);
        return paragraphs;
    }

    public static String[] masWithSentences(String stringForTransform) {
        //разделим абзацы на предложения

        String regexSentences = "[.!?]\\s*";
        String[] sentences = stringForTransform.split(regexSentences);
        return sentences;
    }

    public static String[] masWithWords(String stringForTransform) {
        //разделим предложения на слова

        String regexWords = "\\s*(\\s|,|;|:|-)\\s*";
        String[] words = stringForTransform.split(regexWords);
        return words;
    }

    public static void sortParagraphByCountOfSentences(String str) {

        String[] paragraphs = masWithParagraphs(str);

        int[] countOfSentences = new int[paragraphs.length];
        //Делим все абзацы на предложения и считаем кол-во предложений
        int maxLength = 0;
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = masWithSentences(paragraphs[i]);
            countOfSentences[i] = sentences.length;
            if (sentences.length > maxLength) {
                maxLength = sentences.length;
            }
        }
        System.out.println("Параграфы по увеличению количества предложений:");
        for (int i = 0; i <= maxLength; i++) {

            for (int j = 0; j < countOfSentences.length; j++) {
                if (i == countOfSentences[j]) {
                    System.out.println(paragraphs[j]);
                }
            }
        }
    }

    public static void sortWordByLength(String strForTransform) {
        String[] paragraphs = masWithParagraphs(strForTransform);
        int countParagraphs = 1;
        for (int i = 0; i < paragraphs.length; i++) {
            System.out.println("Параграф " + countParagraphs);

            String[] sentences = masWithSentences(paragraphs[i]);
            int countSentences = 1;
            for (int j = 0; j < sentences.length; j++) {
                System.out.println("Предложение " + countSentences);

                String[] words = masWithWords(sentences[j]);
                for (int k = 0; k < words.length; k++) {

                    for (int d = k + 1; d < words.length; d++) {
                        if (words[k].length() > words[d].length()) {
                            String temp = words[k];
                            words[k] = words[d];
                            words[d] = temp;
                        }
                    }
                    System.out.print(words[k] + " ");

                }
                System.out.println();
                countSentences++;
            }
            countParagraphs++;
        }
    }

    public static String enterFromConsole(String message) {
        Scanner sc = new Scanner(System.in);
        String value;
        System.out.println(message);
        while (!sc.hasNextLine()) {
            sc.next();
            System.out.println(message);
        }
        value = sc.nextLine();
        return value;
    }

    public static void sortWordByCountLexems(String strForTransform) {
        String letter = enterFromConsole("Введите букву >>");
        String[] paragraphs = masWithParagraphs(strForTransform);
        int countParagraphs = 1;
        for (int i = 0; i < paragraphs.length; i++) {
            System.out.println("Параграф " + countParagraphs);

            String[] sentences = masWithSentences(paragraphs[i]);
            int countSentences = 1;
            for (int j = 0; j < sentences.length; j++) {
                System.out.println("Предложение " + countSentences);
                String[] words = masWithWords(sentences[j]);

                for (int k = 0; k < words.length; k++) {
                    for (int d = k + 1; d < words.length; d++) {
                        int countLettersCurrentWords = 0;
                        int countLettersNextWords = 0;
                        for (int p = 0; p < words[k].length(); p++) {
                            if (String.valueOf(words[k].charAt(p)).compareToIgnoreCase(letter) == 0) {
                                countLettersCurrentWords++;
                            }
                        }
                        for (int p = 0; p < words[d].length(); p++) {
                            if (String.valueOf(words[d].charAt(p)).compareToIgnoreCase(letter) == 0) {
                                countLettersNextWords++;
                            }
                        }
                        if (countLettersCurrentWords < countLettersNextWords) {
                            String temp = words[k];
                            words[k] = words[d];
                            words[d] = temp;
                        } else if (countLettersCurrentWords == countLettersNextWords) {
                            String[] wordsToCompare = {words[k], words[d]};
                            Arrays.sort(wordsToCompare, new Comparator<String>() {
                                @Override
                                public int compare(String o1, String o2) {
                                    return o1.compareToIgnoreCase(o2);
                                }
                            });
                            words[k] = wordsToCompare[0];
                            words[d] = wordsToCompare[1];
                        }

                    }
                    System.out.print(words[k] + " ");
                    System.out.println();
                }
                countSentences++;
                System.out.println();
            }
            countParagraphs++;
            System.out.println();
        }
    }
}

