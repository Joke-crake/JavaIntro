package by.epam.jonline.part01;
/* 7. Даны действительные числа a1, a2,...an . Найти
max(a1 + a(2n), a2 + a(2n - 1), ..., an + a(n+1))
 */

import java.util.Random;

public class Task07 {
	public static void main(String[] args) {

		int n = 8;
		int[] a = new int[n];

		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(20);
			System.out.print(a[i] + " ");
		}
		System.out.println();

		int maxSum = a[0] + a[a.length - 1];
		for (int i = 1; i < n; i++) {
			if (a[i] + a[a.length - i - 1] > maxSum) {
				maxSum = a[i] + a[a.length - i - 1];
			}
		}
		System.out.println("максимальная сумма по условию: " + maxSum);
	}
}
