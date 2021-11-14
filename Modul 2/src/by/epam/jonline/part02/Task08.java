package by.epam.jonline.part02;
/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного 
 * столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */

import java.util.Random;
import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		int a;
		int b;
		int n;
		a = enterFromConsole("Введите первый столбец >>");
		b = enterFromConsole("Введите второй столбец >>");
		n = enterFromConsole("Введите порядок матрицы n >>");
		int[][] mas = new int[n][n];
		System.out.println("Исходная матрица:");
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mas[i][j] = rand.nextInt(10);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < n; i++) {
			int temp = mas[i][a - 1];
			mas[i][a - 1] = mas[i][b - 1];
			mas[i][b - 1] = temp;
		}
		System.out.println("Вторая матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
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
