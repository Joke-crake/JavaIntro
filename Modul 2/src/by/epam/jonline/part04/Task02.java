package by.epam.jonline.part04;
// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;

		a = enterFromConsole("a >>");
		b = enterFromConsole("b >>");
		c = enterFromConsole("c >>");
		d = enterFromConsole("d >>");

		int gcd1;
		int gcd2;
		int gcdResult;

		gcd1 = gcd(a, b);
		gcd2 = gcd(gcd1, c);
		gcdResult = gcd(gcd2, d);

		System.out.println("НОД чисел: " + a + ", " + b + ", " + c + ", " + d + " равен " + gcdResult);
	}

	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
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
