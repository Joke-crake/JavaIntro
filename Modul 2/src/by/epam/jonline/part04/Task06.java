package by.epam.jonline.part04;
// 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		a = enterFromConsole("Введите a>> ");
		b = enterFromConsole("Введите b>> ");
		c = enterFromConsole("Введите c>> ");

		if (isSimple(a, b, c)) {
			System.out.println("Числа " + a + ", " + b + ", " + c + " являются взаимно простыми");
		} else {
			System.out.println("Числа " + a + ", " + b + ", " + c + " не являются взаимно простыми");
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static boolean isSimple(int a, int b, int c) {
		return gcd(gcd(a, b), c) == 1;
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
