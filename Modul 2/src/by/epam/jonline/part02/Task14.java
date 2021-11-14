package by.epam.jonline.part02;
/*
 * 14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */

public class Task14 {
	public static void main(String[] args) {
		int m = 7;
		int n = 7;
		int[][] mas = new int[m][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j < i) {
					mas[i][j] = 0;
				} else {
					mas[i][j] = 1;
				}
			}
		}
		System.out.println("Полученный массив:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
