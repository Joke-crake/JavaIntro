package by.epam.jonline.part02;
/*
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */

import java.util.Random;

public class Task09 {
	public static void main(String[] args) {
		int n = 6;
		int m = 4;
		int[][] mas = new int[m + 1][n];
		System.out.println("Исходная матрица:");
		Random rand = new Random();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		int sum = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				sum += mas[i][j];
				mas[m][j] = sum;
			}
			sum = 0;
		}
		System.out.println("Матрица после вычислений:");
		for (int i = 0; i < m + 1; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();

		}
		int max = 0;
		int col = 0;
		for (int j = 0; j < n; j++) {
			if (mas[m][j] > max) {
				max = mas[m][j];
				col = j + 1;
			}
		}
		System.out.println("Максимальная сумма значений равна: " + max + " в " + col + " столбце");
	}
}
