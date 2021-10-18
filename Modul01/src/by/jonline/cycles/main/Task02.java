package by.jonline.cycles.main;

//Вычислить значения функции на отрезке [а,b] c шагом h:
//y = x, x > 2,
//  = -x, x <= 2.
public class Task02 {

	public static void main(String[] args) {

		int a;
		int b;
		int h;
		int y;

		a = -7;
		b = 14;
		h = 3;

		for (int x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
				System.out.println("Значение выражения равно: " + y);
			} else if (x <= 2) {
				y = -x;
				System.out.println("Значение выражения равно: " + y);
			}
		}
	}
}
