package by.epam.jonline.task;

/*
2. В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task02 {
    public static void main(String[] args) {
        String str = "a a d d a a a";
        System.out.println(insertB(str));
    }

    public static StringBuilder insertB(String str) {
        StringBuilder stringResult = new StringBuilder(str);
        for (int i = 0; i < stringResult.length(); i++) {
            if (stringResult.charAt(i) == 'a') {
                stringResult.insert(i + 1, 'b');
            }

        }
        return stringResult;
    }
}
