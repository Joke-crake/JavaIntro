package by.epam.jonline.part03;
/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

import java.util.Random;

public class Task01 {
	public static void main(String[] args) {
		int[] a1 = new int[5];
		int[] a2 = new int[3];
		int k = 2;
		Random rand = new Random();
		System.out.println("Массив 1:");
		for (int i = 0; i < a1.length; i++) {
			a1[i] = rand.nextInt(10);
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		System.out.println("Массив 2:");
		for (int i = 0; i < a2.length; i++) {
			a2[i] = rand.nextInt(10);
			System.out.print(a2[i] + " ");
		}
		System.out.println();

		int b = a1.length;
		int c = a2.length;
		int[] result = new int[b + c];
		System.arraycopy(a1, 0, result, 0, b);
		System.arraycopy(a2, 0, result, b, c);

		int shift;
		for (int i = 0; i < c; i++) {
			shift = i + k;
			int temp = result[shift];
			result[shift] = result[shift + c];
			result[shift + c] = temp;
		}
		System.out.println("Полученный массив");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
