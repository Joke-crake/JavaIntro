package by.jonline.lineprogram.main;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((b + sqrt(b^2 + 4ac))/2a) - (a^3)*c + b^-2
 */

public class Task02 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        double z;

        a = 4;
        b = 8;
        c = 3;

        z = (((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2));

        System.out.println("Значение выражения равно " + z);
    }
}
