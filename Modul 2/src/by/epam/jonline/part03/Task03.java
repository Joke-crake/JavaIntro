package by.epam.jonline.part03;
/*Сортировка выбором. Дана последовательность чисел a1 <= a2 <= a3 <=...<= an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
*/

import java.util.Random;

public class Task03 {
	public static void main(String[] args) {
		int n = 10;
		int[] a = new int[n];
		Random rand = new Random();
		System.out.println("Исходный массив:");
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10);
			System.out.print(a[i] + " ");
		}
		// Сортируем массив выбором
		for (int i = 0; i < a.length; i++) {
			int max = a[i];
			int max_i = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > max) {
					max = a[j];
					max_i = j;
				}
			}
			int temp = a[i];
			a[i] = max;
			a[max_i] = temp;
		}
		System.out.println();
		System.out.println("Cортированный массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
