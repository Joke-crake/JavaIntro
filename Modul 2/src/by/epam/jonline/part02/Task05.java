package by.epam.jonline.part02;
/*
 * 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task05 {
	public static void main(String[] args) {
		int n = 8;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				a[i][j] = i + 1;
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}
	}
}
