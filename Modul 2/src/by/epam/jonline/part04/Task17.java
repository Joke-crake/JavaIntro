package by.epam.jonline.part04;
/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести,
 * чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Task17 {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(result(n));
	}

	public static int sumOfNumber(int n) {
		int sum = 0;
		while (n != 0) {
			int temp = n % 10;
			sum += temp;
			n = n / 10;
		}
		return sum;
	}

	public static int result(int n) {
		int count = 0;
		while (n != 0) {
			n = n - sumOfNumber(n);
			count++;
		}
		return count;
	}
}
