package by.epam.jonline.part02;
/*
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

import java.util.Random;

public class Task13 {
	public static void main(String[] args) {
		int m = 3;
		int n = 5;
		int[][] mas = new int[m][n];

		System.out.println("Заполненный массив");
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(16);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// сортируем столбцы матрицы по возрастанию
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				// введем переменную для сравнения
				for (int k = i + 1; k < m; k++) {
					if (mas[i][j] > mas[k][j]) {
						int temp = mas[i][j];
						mas[i][j] = mas[k][j];
						mas[k][j] = temp;
					}
				}
			}
		}
		System.out.println("Массив со столбцами по возрастанию");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// сортируем столбцы по убыванию
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				// новую переменную
				for (int k = i + 1; k < m; k++) {
					if (mas[i][j] < mas[k][j]) {
						int temp = mas[i][j];
						mas[i][j] = mas[k][j];
						mas[k][j] = temp;
					}
				}
			}
		}
		System.out.println("Массив со столбцами по убыванию");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
