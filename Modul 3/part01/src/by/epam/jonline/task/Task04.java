package by.epam.jonline.task;

/*
4. В строке найти количество чисел.
 */
public class Task04 {
    public static void main(String[] args) {
        String str = "K 1 2 3 second 45 65 89 ki on table";
        int countOfNumber = countOfNumbers(str);
        System.out.println("В строке " + countOfNumber + " чисел");

    }

    public static int countOfNumbers(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
                for (int j = i + 1; j < str.length(); j++) {
                    if (!Character.isDigit(str.charAt(j))) {
                        i = j;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
