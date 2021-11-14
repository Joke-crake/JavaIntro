package by.epam.jonline.part02;

/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Random;

public class Task02 {
	public static void main(String[] args) {
		int n = 5;
		int[][] a = new int[5][5];

		System.out.println("Исходная матрица: ");
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Диагональ 1");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i][i] + " ");
		}
		System.out.println();

		System.out.println("Диагональ 2");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i][n - 1 - i] + " ");
		}
	}
}


