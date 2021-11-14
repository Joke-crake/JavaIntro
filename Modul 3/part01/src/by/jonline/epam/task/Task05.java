package by.jonline.epam.task;

/*
5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class Task05 {
    public static void main(String[] args) {
        String str = " строка   с множеством  пробелов,  если пробелов   больше 1,  то оставить только один ";
        System.out.println(str);
        StringBuilder strResult = stringWithOneSpace(str);
        System.out.println(strResult);
    }

    public static StringBuilder stringWithOneSpace(String strForDeleteSpaces) {
        StringBuilder str = new StringBuilder();
        boolean isSpace = false;
        for (int i = 0; i < strForDeleteSpaces.length(); i++) {
            if (strForDeleteSpaces.charAt(i) == ' ') {
                if (!isSpace) {
                    str.append(" ");
                }
                isSpace = true;
            } else {
                str.append(strForDeleteSpaces.charAt(i));
                isSpace = false;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0) == ' ') {
                str.deleteCharAt(0);
            } else if (str.charAt(str.length() - 1) == ' ') {
                str.deleteCharAt(str.length() - 1);
            }
        }
        return str;
    }
}
