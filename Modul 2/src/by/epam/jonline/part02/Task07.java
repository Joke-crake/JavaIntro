package by.epam.jonline.part02;
/*
 * Сформировать квадратную матрицу порядка N по правилу:
 */

public class Task07 {
	public static void main(String[] args) {
		int n = 5;
		double[][] a;
		a = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = Math.sin(((i * i - j * j) / n));
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0) {
					count++;
				}
			}
		}
		System.out.println("Положительных элементов: " + count);
	}
}
