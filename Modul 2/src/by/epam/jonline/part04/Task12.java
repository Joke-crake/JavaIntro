package by.epam.jonline.part04;

/*
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task12 {
	public static void main(String[] args) {
		int k;
		int n;
		k = 6;
		n = 8;
		if (isCheck(k, n)) {
			int[] mas = newArr(n, k, masLength(k, n));
			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i] + " ");
			}
		} else {
			System.out.println("Значение n должно быть больше либо равно k.");
		}
	}

	public static boolean isCheck(int k, int n) {
		if (n < k) {
			return false;
		}
		return true;
	}

	public static int masLength(int k, int n) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				sum = i + j;
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}

	public static int[] newArr(int n, int k, int count) {
		int[] a = new int[count];
		int sum = 0;
		for (int i = 0; i <= a.length; i++) {
			for (int j = 0; j <= a.length; j++) {
				sum = i + j;
				if (sum == k) {

					sum = i * 10 + j;
					a[i] = sum;
				}

			}
		}
		return a;
	}

}
