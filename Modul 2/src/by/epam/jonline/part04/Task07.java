package by.epam.jonline.part04;
// 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task07 {
	public static void main(String[] args) {
		int n = 9;
		System.out.println(factorSum(n));
	}

	public static long factorSum(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i += 2) {
			sum += factor(i);

		}
		return sum;
	}

	public static long factor(int n) {
		int factor = 1;
		for (int i = 1; i <= n; i++) {
			factor = factor * i;
		}
		return factor;
	}
}


