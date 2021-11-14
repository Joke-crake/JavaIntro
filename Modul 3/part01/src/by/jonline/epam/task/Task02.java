package by.jonline.epam.task;

/*
2. Замените в строке все вхождения 'word' на 'letter'.
 */

public class Task02 {
    public static void main(String[] args) {
        String strWithWord = "word and letter doing anything together by word.";

        String strWithLetter1 = changeWordOnLetter(strWithWord);
        String strWithLetter2 = changeWordOnLetter1(strWithWord);
        System.out.println(strWithLetter2);
        System.out.println(strWithLetter1);
    }

    public static String changeWordOnLetter(String strForChange) {
        return strForChange.replace("word", "letter");
    }

    public static String changeWordOnLetter1(String strForChange) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] str = strForChange.toCharArray();
        for (int i = 0; i < strForChange.length(); i++) {
            if (str[i] == 'w' && str[i + 1] == 'o' && str[i + 2] == 'r' && str[i + 3] == 'd') {
                stringBuilder.append("letter");
                i = i + 3;
            } else {
                stringBuilder.append(str[i]);
            }
        }
        return stringBuilder.toString();
    }
}
