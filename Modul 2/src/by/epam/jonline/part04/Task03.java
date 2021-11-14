package by.epam.jonline.part04;
//3. Вычислить площадь правильного шестиугольника со стороной а, 
//используя метод вычисления площади треугольника.

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		int a;
		a = enterFromConsole("Введите сторону правильного шестиугольника >>");

		double square;
		square = square(a);

		System.out.println("Площадь шестиугольника со стороной а = " + a + ", равен " + square);
	}

	public static double square(int a) {
		return (3 * Math.sqrt(3) * a * a) / 2;
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;
	}
}
