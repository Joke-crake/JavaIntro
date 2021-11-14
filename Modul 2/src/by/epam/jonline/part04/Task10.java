package by.epam.jonline.part04;
/*
 * 10. Дано натуральное число N. Написать метод(методы) для формирования
 *  массива, элементами которого являются цифры числа N.
 */

public class Task10 {
	public static void main(String[] args) {
		int n;
		n = 123456789;

		int[] arr = mas(n, count(n));
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int count(int n) {
		int i = 0;
		while (n != 0) {
			n = n / 10;
			i++;
		}
		return i;
	}

	public static int[] mas(int n, int count) {
		int[] mas = new int[count];
		int temp = 0;
		while (n != 0) {
			temp = n % 10;
			mas[count - 1] = temp;
			n = n / 10;
			count--;
		}
		return mas;
	}
}
