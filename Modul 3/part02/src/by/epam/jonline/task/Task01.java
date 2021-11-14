package by.epam.jonline.task;

/*
1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task01 {
    public static void main(String[] args) {
        String str = "Rabbit crocodile  cat  dog      peoples";
        printMessage(str, countOfSpaces(str));
    }

    public static int countOfSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int tempCount = 0;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == ' ') {
                        tempCount++;
                    } else {
                        break;
                    }
                }
                if (count < tempCount) {
                    count = tempCount;
                }
            }
        }
        return count;
    }

    public static void printMessage(String str, int n) {
        System.out.println("В строке: " + str);
        System.out.println("наиболшее количество пробелов подряд: " + n);
    }
}
