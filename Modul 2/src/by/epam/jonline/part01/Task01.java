package by.epam.jonline.part01;
//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		int n = 5;
		int k = 4;
		int[] a = new int[n];

		initArray(a);
		printMass(a);

		System.out.println();
		System.out.println("Сумма элементов, кратных " + k + ", равна " + sumEl(a, k));
	}

	public static void printMass(int[] mas) {
		System.out.print("Полученынй массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

	public static int sumEl(int[] mas, int k) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		return sum;
	}

	public static void initArray(int[] mas) {
		if (mas == null) {
			return;
		}

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
	}
}
