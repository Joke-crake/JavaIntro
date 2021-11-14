package by.epam.jonline.part01;

/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class Task09 {
	public static void main(String[] args) {

		int[] a = {4, 5, 6, 6, 5, 5, 6, 7};

		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int currentCounter = 0;
		int biggestCounter = 0;
		int frequentElement = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] == a[j]) {
					currentCounter++;
				}
			}
			if (currentCounter > biggestCounter) {
				biggestCounter = currentCounter;
				frequentElement = i;
			} else if (currentCounter == biggestCounter) {
				if (a[currentCounter] < a[biggestCounter]) {
					frequentElement = i;
				}
			}
			currentCounter = 0;
		}
		int minValue = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < minValue) {
				minValue = a[i];
			}
		}

		if (biggestCounter != 0) {
			System.out.println("Наиболее часто встречающийся элемент " + a[frequentElement] + " встречается " + biggestCounter + " раз");
		}
	}
}
