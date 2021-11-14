package by.epam.jonline.part04;
/*
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task11 {
	public static void main(String[] args) {
		int n1;
		int n2;
		n1 = 4568963;
		n2 = 965823;
		if (isMoreCount(n1, n2)) {
			System.out.println("В числе n1: " + n1 + " больше цифр, чем в n2: " + n2);
		} else {
			System.out.println("В числе n2: " + n2 + " больше цифр, чем в n1: " + n1);
		}
	}

	public static boolean isMoreCount(int n1, int n2) {
		return n1 > n2;
	}

	public static int count(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}
