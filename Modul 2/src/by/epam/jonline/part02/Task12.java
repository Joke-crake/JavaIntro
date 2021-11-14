package by.epam.jonline.part02;
/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

import java.util.Random;

public class Task12 {
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
		// сортируем массив по возрастанию
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				// нужно с чем-то сравнивать, вводим переменную для сравнения
				for (int k = j + 1; k < mas[i].length; k++) {
					if (mas[i][j] > mas[i][k]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i][k];
						mas[i][k] = temp;
					}
				}
			}
		}
		// Вывод сортированного массива (строки по возрастанию)
		System.out.println("сортированный массив (строки по возрастанию):");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// сортируем массив по убыванию
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				// нужно с чем-то сравнивать, вводим переменную для сравнения
				for (int k = j + 1; k < mas[i].length; k++) {
					if (mas[i][j] < mas[i][k]) {
						int temp = mas[i][j];
						mas[i][j] = mas[i][k];
						mas[i][k] = temp;
					}
				}
			}
		}
		// Вывод сортированного массива (строки по убыванию)
		System.out.println("сортированный массив (строки по убыванию):");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
