package by.epam.jonline.branching.main;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет
ли он прямоугольным.
 */
public class Task01 {
	public static void main(String[] args) {

		int a;
		int b;

		a = 45;
		b = 45;

		if ((a + b) < 180 && a > 0 && b > 0) {
			System.out.print("Такой треугольник существует");
			if (a == 90 || b == 90 || (180 - (a + b)) == 90) {
				System.out.print(" и он прямоугольный");
			}
		} else {
			System.out.println("Такого прямоугольника не существует.");
		}
	}
}
