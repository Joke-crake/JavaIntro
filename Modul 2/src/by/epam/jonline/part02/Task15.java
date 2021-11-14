package by.epam.jonline.part02;
/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

import java.util.Random;

public class Task15 {
	public static void main(String[] args) {
		int n = 5;
		int[][] mas = new int[n][n];
		Random rand = new Random();
		System.out.println("Исходный массив: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		int max = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
		}
		System.out.print("Максимальное значение массива: " + max);
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 != 0 && j % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}
		System.out.println();
		System.out.println("Новый массив:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
