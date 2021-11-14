package by.epam.jonline.part02;
/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task06 {
	public static void main(String[] args) {
		int n = 8;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (n - i - 1 > j && i > j || i > n - j - 1 && n - i - 1 > n - j - 1) {
					a[i][j] = 0;
				} else {
					a[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
