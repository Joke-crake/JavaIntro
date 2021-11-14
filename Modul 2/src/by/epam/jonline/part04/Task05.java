package by.epam.jonline.part04;
/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */

import java.util.Random;
import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		int n;
		n = enterFromConsole("Введите количество элементов в массиве:");
		int[] a = new int[n];
		mas(n, a);
		int b;
		b = preMax(a);
		System.out.println("Предмаксимальный элемент массива это: " + b);
	}

	public static int preMax(int[] a) {
		int max = 0;
		int preMax = 0;
		if (a.length >= 2) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				}
			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] > preMax && a[i] < max) {
					preMax = a[i];
				}
			}
		} else {
			System.out.println("В массиве только один элемент!");
		}
		return preMax;
	}

	public static void mas(int n, int[] a) {
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(11);
			System.out.print(a[i] + " ");
		}
		System.out.println();
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
