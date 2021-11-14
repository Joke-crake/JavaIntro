package by.jonline.epam.task;

/*
3. В строке найти количество цифр.
 */

public class Task03 {
    public static void main(String[] args) {
        String str = "1 2 3 145 graduate and second place";
        int count;
        count = countOfNumbers(str);
        System.out.println("В строке " + count + " цифр.");

    }

    public static int countOfNumbers(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
