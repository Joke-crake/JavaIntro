package by.epam.jonline.part04;

/*
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных 
элементов массива с номерами от k до m.
 */

import java.util.Random;
import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		int n;
		n = enterFromConsole("Введите желаемый размер массива не менее 7>> ");
		int[] a = new int[n];
		massInitial(n, a);
		int sumMas = 0;

		if (isTrue(n)) {
			sumMas = sum(a, 1) + sum(a, 3) + sum(a, 4);
			System.out.println("Сумма элементов массива равна: " + sumMas);
		} else {
			System.out.println("N должно быть не меньше 7");
		}
	}

	public static boolean isTrue(int n) {
		if (n < 7) {
			return false;
		}
		return true;
	}

	public static void massInitial(int n, int[] a) {
		System.out.println("Полученный массив: ");
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10);
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int sum(int[] a, int k) {
		int sum = 0;
		for (int i = k; i <= k + 2; i++) {
			sum += a[i];
		}
		return sum;
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
