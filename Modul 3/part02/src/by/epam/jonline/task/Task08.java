package by.epam.jonline.task;

/*
8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */
public class Task08 {
    public static void main(String[] args) {
        String str = "Кот Собака Дракон Суслик Альберт";
        System.out.println("Самое длинное слово " + moreLongWordFromString(str));
    }

    public static String moreLongWordFromString(String str) {
        String[] words = str.split(" ");
        String resultWord = "";
        for (String word : words) {
            if (word.length() > resultWord.length()) {
                resultWord = word;
            }
        }
        return resultWord;
    }
}
