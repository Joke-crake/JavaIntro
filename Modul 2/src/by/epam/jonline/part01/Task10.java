package by.epam.jonline.part01;
/*
 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task10 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				a[i] = 0;
			}
		}
		System.out.print("Новый массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
