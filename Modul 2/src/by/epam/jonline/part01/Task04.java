package by.epam.jonline.part01;
/*
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task04 {
	public static void main(String[] args) {

		int[] mas = new int[]{200, 2, 3, 4, -365, 6, 12, 46, 13};

		int indMax = 0;
		int indMin = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > mas[indMax]) {
				indMax = i;
			} else if (mas[i] < mas[indMin]) {
				indMin = i;
			}
		}
		System.out.print("Исходный массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("Максимальный элемент массива с индексом " + indMax + " это " + mas[indMax]);
		System.out.println("Минимальный элемент массива с индексом " + indMin + " это " + mas[indMin]);

		int change = mas[indMax];
		mas[indMax] = mas[indMin];
		mas[indMin] = change;

		System.out.print("Измененный массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
			System.out.print(" ");
		}
	}
}
