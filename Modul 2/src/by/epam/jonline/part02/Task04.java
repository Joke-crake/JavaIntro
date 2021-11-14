package by.epam.jonline.part02;
/*
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task04 {
	public static void main(String[] args) {

		int n = 8;
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					a[i][j] = j + 1;
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			} else {
				for (int j = 0; j < n; j++) {
					a[i][j] = n - j;
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
