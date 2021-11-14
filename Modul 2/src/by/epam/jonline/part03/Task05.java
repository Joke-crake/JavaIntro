package by.epam.jonline.part03;
/*
 * 5. Сортировка вставками. Дана последовательность чисел n a ,a , ,a 1 2  . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть i a ,a , ,a 1 2  - упорядоченная последовательность, т. е.
n a  a  a 1 2 . Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task05 {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 6, 9, 12, 45, 5, 6, 7, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int temp = a[i + 1];
				int j = binarySearch(a, i, a[i + 1]);
				for (int k = i + 1; k > j; k--) {
					a[k] = a[k - 1];
				}
				a[j] = temp;
			}
		}
		System.out.println("Полученный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int binarySearch(int[] array, int endInd, int num) {
		int j = endInd;
		int beginInd = 0;
		while (beginInd <= endInd) {
			j = (beginInd + endInd) / 2;
			if (array[j] == num) {
				return j;
			} else if (array[j] < num) {
				beginInd = j + 1;
			} else if (array[j] > num && j != 0 && !(array[j - 1] < num)) {
				endInd = j - 1;
			} else {
				break;
			}
		}
		return j;

	}
}
