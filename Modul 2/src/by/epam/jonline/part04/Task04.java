package by.epam.jonline.part04;
/*
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние. Указание.
 * Координаты точек занести в массив.
 */

import java.util.Random;
import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {

		int n;
		n = enterFromConsole("Введите количество точек >>");
		int x[] = new int[n];
		int y[] = new int[n];

		enterArray(x, y);
		showMas(x, y);

		int[] index = distanceMax(x, y);
		System.out.println("Между точками: " + x[index[0]] + "; " + y[index[0]] + " и " + x[index[1]] + "; " + y[index[1]] + " максимальное расстояние");
	}

	public static int[] distanceMax(int[] x, int[] y) {
		int[] index = new int[2];
		double max = 0;
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				double d = distance(x[i], x[j], y[i], y[j]);
				if (max < d) {
					index[0] = i;
					index[1] = j;
					max = d;
				}
			}
		}
		return index;
	}

	public static void showMas(int[] array1, int[] array2) {
		System.out.println("Полученные точки: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println((i + 1) + ": (" + array1[i] + ";" + array2[i] + ")");
		}
	}

	public static double distance(int x1, int x2, int y1, int y2) {
		return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
	}

	public static void enterArray(int[] array1, int[] array2) {
		Random rand = new Random();
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(11);
			array2[i] = rand.nextInt(11);
		}
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;
	}
}
