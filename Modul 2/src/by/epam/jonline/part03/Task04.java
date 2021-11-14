package by.epam.jonline.part03;
/*
Сортировка обменами. Дана последовательность чисел a1 < a2 < a3 < ... < an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа 1+i i a и a . Если 1+  i i a a , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task04 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					count++;
				}
			}
		}
		System.out.println("Полученный масив:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Количество перестановок: " + count);
	}
}
