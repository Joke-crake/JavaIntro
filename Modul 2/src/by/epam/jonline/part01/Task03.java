package by.epam.jonline.part01;
/*
 * 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */

public class Task03 {
	public static void main(String[] args) {

		int a[] = new int[]{-8, -6, 2, 3, 0, 8, -9, 13, 5, 0, 0};

		printMas(a, "Введенный массив: ");
		System.out.println();
		System.out.println(countZero(a, "Количество нулей: "));
		System.out.println(countPositive(a, "Количество положительных элементов: "));
		System.out.println(countNegarive(a, "Количество отрицательных элементов: "));
	}

	public static void printMas(int mas[], String message) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
			System.out.print(" ");
		}
	}

	public static int countZero(int mas[], String message) {
		System.out.print(message);
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}
		}
		return count;
	}

	public static int countPositive(int mas[], String message) {
		System.out.print(message);
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static int countNegarive(int mas[], String message) {
		System.out.print(message);
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				count++;
			}
		}
		return count;
	}
}
