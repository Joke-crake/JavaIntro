package by.epam.jonline.task;

/*
3. Проверить, является ли заданное слово палиндромом.
 */
public class Task03 {
    public static void main(String[] args) {
        String palindrom = "adsrsda";
        String notPalindrom = "adsasd";
        printInfo(palindrom, isPalindrom(palindrom));
        printInfo(notPalindrom, isPalindrom(notPalindrom));

    }

    public static boolean isPalindrom(String str) {

        for (int i = 0, j = str.length() - 1; i < str.length() && j > 0; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void printInfo(String wordForCheck, boolean result) {
        if (result) {
            System.out.println("Слово " + wordForCheck + " является палиндромом");
        } else {
            System.out.println("Слово " + wordForCheck + " не является палиндромом");
        }
    }
}
