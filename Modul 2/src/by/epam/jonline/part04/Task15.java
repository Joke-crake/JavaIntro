package by.epam.jonline.part04;

/*
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task15 {
	public static void main(String[] args) {
		int n = 4;
		int[] arr = findElementsOfNewArr(n);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static boolean checkNum(int n) {
		if (n < 1) {
			return false;
		} else {
			return true;
		}
	}

	public static int[] incNums(int number, int n) {
		int[] arr = new int[n];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (number != 0) {
				arr[i] = number % 10;
				number = number / 10;
			}
		}
		return arr;
	}

	public static boolean findIncNums(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			if (i + 1 == arr.length) {
				break;
			}
			if (arr[i] >= arr[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static int findLengthOfNewArr(int n) {
		int i = (int) Math.pow(10, n - 1);
		int counter = 0;
		for (; i < (int) Math.pow(10, n); i++) {
			if (findIncNums(incNums(i, n))) {
				counter++;
			}
		}
		return counter;
	}

	public static int[] findElementsOfNewArr(int n) {
		int i = (int) Math.pow(10, n - 1);
		int k = 0;
		int arr[] = new int[findLengthOfNewArr(n)];

		for (int j = 0; j < arr.length; j++) {
			for (; i < (int) Math.pow(10, n); i++) {
				if (findIncNums(incNums(i, n))) {
					arr[j] = i;
					k = i;
					break;
				}
			}
			k++;
			i = k;
		}
		return arr;
	}
}
