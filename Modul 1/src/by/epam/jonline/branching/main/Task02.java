package by.epam.jonline.branching.main;

//Найти max{min(a, b), min(c, d)}.
public class Task02 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = 456;
		b = 489;
		c = 987;
		d = 873;

		System.out.println("Максимальное число равно: " + Math.max(Math.min(a, b), Math.min(c, d)));
	}
}
