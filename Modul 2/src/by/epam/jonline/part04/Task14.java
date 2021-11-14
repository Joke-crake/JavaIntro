package by.epam.jonline.part04;
/*
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения задачи использовать декомпозицию.
 */

public class Task14 {
	public static void main(String[] args) {
		int k;
		k = 1000;
		printArmstrongNembers(k);
	}

	public static void printArmstrongNembers(int k) {
		for (int i = 0; i <= k; i++) {
			if (isArmstrongNumber(i)) {
				System.out.println(i + " является числом Армстронга");
			}
		}
	}

	public static boolean isArmstrongNumber(int n) {
		if (Math.pow(sum(n), count(n)) == n) {
			return true;
		} else {
			return false;
		}
	}

	public static int count(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static int sum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}
}
