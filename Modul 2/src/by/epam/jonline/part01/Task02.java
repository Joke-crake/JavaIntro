package by.epam.jonline.part01;
//2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Task02 {
	public static void main(String[] args) {
		int z = 5;
		int a[] = new int[]{1, 2, 3, 4, 4, 6, 7, 8, 9, 10, 12};

		printMas(a, "Изначальный массив: ");

		int a1[] = new int[a.length];
		newA(a, a1, z);
		System.out.println();
		printMas(a1, "Новый массив: ");
		System.out.println();
		System.out.println("Количество замен: " + count(a, a1, z));
	}

	public static void printMas(int mas[], String message) {
		System.out.print(message);
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
			System.out.print(" ");
		}
	}

	public static void newA(int mas1[], int mas2[], int z) {
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] < z) {
				mas2[i] = mas1[i];
			} else {
				mas2[i] = z;
			}
		}
	}

	public static int count(int mas1[], int mas2[], int z) {
		int count = 0;
		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] > z) {
				count++;
			}
		}
		return count;
	}

}
