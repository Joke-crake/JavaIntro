package by.epam.jonline.part02;
/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

import java.util.Random;

public class Task03 {
	public static void main(String[] args) {
		int n = 5;
		int d = 6;
		int[][] a = new int[n][d];
		int k = 3;
		int p = 4;

		System.out.println("Исходная матрица: ");
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(k + " строка: ");
		for (int i = 0; i <= d - 1; i++) {
			System.out.print(a[k - 1][i] + " ");
		}
		System.out.println();
		System.out.println(p + " cтолбец: ");
		for (int i = 0; i <= n - 1; i++) {
			System.out.print(a[i][p - 1] + " ");
		}
	}
}
