package by.jonline.epam.task;

/*
4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Task04 {
    public static void main(String[] args) {
        String str1 = "информатика";
        System.out.println(wordTort(str1));

    }

    public static String wordTort(String str) {
        String tort = String.valueOf(str.charAt(str.indexOf('т')));
        tort += String.valueOf(str.charAt(str.indexOf('о')));
        tort += String.valueOf(str.charAt(str.indexOf('р')));
        tort += String.valueOf(str.charAt(str.indexOf('т')));
        return tort;
    }
}
