package by.epam.jonline.part04;

/*
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2
 * (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n],
 * где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */

public class Task13 {
	public static void main(String[] args) {
		int n;
		n = 13;
		if (checkNum(n)) {
			int[] arr = arr(n);
			outputArr(arr);
			int[][] arr2 = resultMass(arr);
			outputDoubleArr(arr2);
		} else {
			System.out.println("Число n меньше 2");
		}
	}

	public static boolean checkNum(int num) {
		if (num <= 2) {
			return false;
		} else {
			return true;
		}
	}

	public static int[] arr(int n) {
		int[] arr = new int[n + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n;
			n++;
		}
		return arr;
	}

	public static boolean isSimple(int n) {
		int counter = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				counter++;
				if (counter > 2) {
					return false;
				}
			}
		}
		return true;
	}

	public static int findQuantity(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			if (isSimple(arr[i]) && isSimple(arr[i + 2])) {
				count++;
			}
		}
		return count;
	}

	public static int[][] resultMass(int[] arr) {
		int j = 0;
		int count = findQuantity(arr);
		int[][] resultMas = new int[count][2];
		for (int i = 0; i < arr.length - 2; i++) {
			if (isSimple(arr[i]) && isSimple(arr[i + 2])) {
				resultMas[j][0] = arr[i];
				resultMas[j][1] = arr[i + 2];
				j++;
			}
		}
		return resultMas;
	}

	public static void outputArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void outputDoubleArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
