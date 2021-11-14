package by.epam.jonline.part03;
/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента i i+1 a и a . Если +1  i i a a , то продвигаются
на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */

public class Task06 {
	public static void main(String[] args) {
		int[] a = new int[]{3, 9, 5, 6, 8, 4, 2, 4, 5, 8, 2, 3, 6, 5};
		int n = a.length;
		int h = 1;
		while (h < n / 3) {
			h = 3 * h + 1;
		}
		while (h >= 1) {
			for (int i = h; i < a.length; i++) {
				for (int j = i; j >= h && a[j] > a[j - h]; j -= h) {
					int temp = a[j];
					a[j] = a[j - h];
					a[j - h] = temp;
				}
			}
			h = h / 3;
		}
		System.out.println("Полученный массив: ");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}
}
