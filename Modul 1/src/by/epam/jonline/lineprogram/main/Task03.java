package by.epam.jonline.lineprogram.main;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(sin(x) + cos(y))/(cos(x) - sin(y)) * tg(x * y)
 */
public class Task03 {

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        x = 6.0;
        y = 5.0;

        z = (Math.sin(x) + Math.sin(y)) / (Math.cos(x) - Math.cos(y)) * Math.tan(x * y);

        System.out.println("Значение выражения равно: " + z);
    }
}
