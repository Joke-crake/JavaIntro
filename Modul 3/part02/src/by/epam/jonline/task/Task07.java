package by.epam.jonline.task;

/*
7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
 */
public class Task07 {
    public static void main(String[] args) {
        String str = "abc cde def";
        System.out.println(stringWithoutDoubleCharsAndSpaces(str));
    }

    public static String stringWithoutDoubleCharsAndSpaces(String strForTransform) {
        StringBuilder resultString = new StringBuilder(strForTransform);
        for (int i = 0; i < resultString.length(); i++) {
            if (resultString.charAt(i) == ' ') {
                resultString.deleteCharAt(i);
            }
            for (int j = resultString.length() - 1; j > i; j--) {
                if (resultString.charAt(i) == resultString.charAt(j)) {
                    resultString.deleteCharAt(j);
                }
            }
        }
        return resultString.toString();
    }
}
