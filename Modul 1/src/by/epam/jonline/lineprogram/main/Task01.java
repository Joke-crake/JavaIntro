package by.epam.jonline.lineprogram.main;

/*Найдите значение функции:
 z = ( (a – 3 ) * b / 2) + c
 */
public class Task01 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		double z;

		a = 4;
		b = 8;
		c = 7;

		z = ((a - 3) * b / 2) + c;

		System.out.println("Значение выражения = " + z);
	}
}
