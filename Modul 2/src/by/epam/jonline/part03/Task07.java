package by.epam.jonline.part03;
/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел n m a  a  a и b  b  b 1 2 1 2 .
Требуется указать те места, на которые нужно вставлять элементы последовательности m b  b  b 1 2 в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task07 {
	public static void main(String[] args) {
		int[] a1 = new int[]{2, 5, 6, 8, 9, 12, 15, 19, 23, 26, 28};
		int[] a2 = new int[]{3, 4, 6, 8, 9, 10, 11, 13, 15, 16, 18, 19, 22};
		int[] a3 = new int[a1.length + a2.length];
		int[] a4 = new int[a2.length];
		int i, j, k;
		for (i = j = k = 0; i < a1.length && j < a2.length; k++) {
			if (a1[i] < a2[j]) {
				a3[k] = a1[i];
				i++;
			} else {
				a4[j] = i + 1;
				a3[k] = a2[j];
				j++;
			}
		}
		for (; i < a1.length; i++, k++) {
			a3[k] = a1[i];
		}
		for (; j < a2.length; j++, k++) {
			a4[j] = i;
			a3[k] = a2[j];
		}
		System.out.println("Получился массив: ");
		for (int m = 0; m < a3.length; m++) {
			System.out.print(a3[m] + " ");
		}
	}
}
