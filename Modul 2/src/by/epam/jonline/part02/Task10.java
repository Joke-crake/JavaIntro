package by.epam.jonline.part02;
/*
 * 10. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
	public static void main(String[] args) {
		int[][] mas = new int[][]{{-3, -2, -6, 4, 5, 6}, {1, -6, 6, 5, 9, 8}, {1, 2, 3, 4, 5, 6},
				{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
		System.out.println("Исходная матрица:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Положительные элементы главных диагоналей");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] > 0) {
				System.out.print(mas[i][i] + " ");
			}

		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i][mas.length - 1 - i] > 0) {
				System.out.print(mas[i][mas.length - 1 - i] + " ");
			}
		}
	}
}
