package by.epam.jonline.task;

/*
10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */
public class Task10 {
    public static void main(String[] args) {
        String x = "Осень золотая. Ура! Дети пошли в школу. Думаете ли вы, что осень будет холодной?";
        System.out.println("В строке x - " + countOfSentences(x) + " предложений.");
    }

    public static int countOfSentences(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
                count++;
            }
        }
        return count;
    }
}
