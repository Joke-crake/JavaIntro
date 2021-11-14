package by.epam.jonline.part02;
/*
 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */

import java.util.Random;

public class Task11 {
	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		int[][] mas = new int[m][n];

		System.out.println("Заполненный массив числами от 0 до 15:");
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(16);
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			int count = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.println("3 и более раз число 5 повторяется в " + i + " строке ");
			}
		}
	}
}
