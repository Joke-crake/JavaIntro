package by.jonline.epam.task;

/*
5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Task05 {
    public static void main(String[] args) {
        String str = "a a a a a b b b c a a a";
        printInfo(str, countOfA(str, 'a'), 'a');
    }

    public static int countOfA(String strForSearchLetterA, char ch) {
        int count = 0;
        for (int i = 0; i < strForSearchLetterA.length(); i++) {
            if (strForSearchLetterA.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void printInfo(String str, int count, char ch) {
        System.out.println("В строке: " + str);
        System.out.println("буква " + ch + " встречается " + count + " раз.");
    }
}
