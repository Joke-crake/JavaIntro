package by.epam.jonline.part01;
/*
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */

public class Task06 {
	public static void main(String[] args) {
		int[] mas = {2, 3, 5, 6, 8, 9, 6, 4, 8, 6};

		System.out.print("Полученый массив: ");
		for (int i = 1; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		int sum = 0;
		for (int i = 2; i < mas.length; i++) {
			if (isPrime(i)) {
				sum += mas[i];
			}
		}
		System.out.println();
		System.out.println("Сумма чисел с простыми индексами равна: " + sum);
	}

	public static boolean isPrime(int n) {
		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}
}
