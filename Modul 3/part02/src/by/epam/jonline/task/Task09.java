package by.epam.jonline.task;

/*
9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
 */
public class Task09 {
    public static void main(String[] args) {
        String str = "abcварdeFdFd кернг";
        System.out.println("Заглавных английских букв в строке: " + countOfEnglishLetterUpperCase(str));
        System.out.println("Строчных английских букв в строке: " + countOfEnglishLetterLowerCase(str));
    }

    public static int countOfEnglishLetterUpperCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static int countOfEnglishLetterLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
        }
        return count;
    }
}
