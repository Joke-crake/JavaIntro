package by.epam.jonline.part01;
/*
 * 8. Дана последовательность целых чисел а1, а2, ... , аn. 
 * Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a1, a2, ..., an).
 */

public class Task08 {
	public static void main(String[] args) {

		int[] a = {4, 5, -2, -2, 8, 9, -2, 45};

		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		int p = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != min) {
				p++;
			}
		}

		if (p != 0) {
			int[] a1 = new int[p];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != min) {
					a1[j] = a[i];
					j++;
				}
			}

			System.out.print("Новый массив:");
			for (int i = 0; i < a1.length; i++) {
				System.out.print(a1[i] + " ");
			}
		} else {
			System.out.println("В массиве нет наименьшего значения.");
		}
	}
}
