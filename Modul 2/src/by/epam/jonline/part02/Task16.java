package by.epam.jonline.part02;
/*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 */


import java.util.Arrays;

public class Task16 {
	public static void main(String[] args) {
		int n = 3;
		int[][] mas = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(mas[i], 0);
		}
		int count = 1, y = 0, x = mas.length / 2;
		while (true) {
			mas[y][x] = count;
			count++;
			if (((y == 0) && (x >= n - 1)) && (mas[n - 1][0] != 0)) {
				y++;
			} else {
				y--;
				if (y < 0) {
					y = n - 1;
				}
				x++;
				if (x == n) {
					x = 0;
				}
				if (mas[y][x] != 0) {
					y += 2;
					x--;
				}
			}
			if (count == n * n + 1) {
				break;
			}
		}
		System.out.println("Новый массив:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}
