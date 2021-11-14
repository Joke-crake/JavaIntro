package by.epam.jonline.task;

/*
6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task06 {
    public static void main(String[] args) {
        String str = "a b c d e f g";
        System.out.println(stringWithDoubleChars(str));
    }

    public static StringBuilder stringWithDoubleChars(String str) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            resultString.append(str.charAt(i));
            resultString.append(str.charAt(i));
        }
        return resultString;
    }
}
