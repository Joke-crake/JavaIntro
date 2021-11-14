package by.epam.jonline.part04;
/*
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также,
 * сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task16 {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(findSumNums(n));
	}

	public static int count(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public static boolean checkCount(int n, int number) {
		if (count(number) == n) {
			return true;
		}
		return false;
	}

	public static boolean den2(int number) {
		while (number != 0) {
			int temp = number % 10;
			if (temp % 2 == 0) {
				return false;
			}
			number = number / 10;
		}
		return true;
	}

	public static int countNumbers(int number) {
		int counter = 0;
		while (number != 0) {
			int temp = number % 10;
			if (temp % 2 == 0) {
				counter++;
			}
			number = number / 10;
		}
		return counter;
	}

	public static int findSumNums(int n) {
		int sum = 0;
		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			if (checkCount(n, i)) {
				if (den2(i)) {
					sum += i;
				}
			}
		}
		return sum;
	}
}
