package by.epam.jonline.part01;
/*
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task05 {
	public static void main(String[] args) {
		int[] mas = new int[]{0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 15};
		System.out.print("Исходный массив: ");

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
			System.out.print(" ");
		}

		System.out.println();
		System.out.print("Новый массив: ");
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i]);
				System.out.print(" ");
			}
		}
	}
}
