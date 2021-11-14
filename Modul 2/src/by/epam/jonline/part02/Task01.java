package by.epam.jonline.part02;

/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

public class Task01 {
	public static void main(String[] args) {
		int[][] a = {{7, 8, 9, 1, 3}, {4, 5, 6, 7, 8}, {4, 5, 8, 9, 6}, {1, 1, 12, 1, 1}};

		System.out.print("Исходная матрица: ");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i <= a.length; i += 2) {
			if (a[0][i] > a[a.length - 1][i]) {
				System.out.println("Столбец №" + (i + 1));
				for (int j = 0; j < a.length; j++) {
					System.out.println(a[j][i]);
				}
			}

		}

	}
}
