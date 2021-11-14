package by.epam.jonline.branching.main;

/*Вычислить значение функции:
F(x) = x^2 - 3*x + 9, если x <= 3;
       1/(x^3 + 6), если x > 3;
 */

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println(">> ");
		while (sc.hasNextInt() == false) {
			sc.nextLine();
			System.out.println(">>");
		}
		x = sc.nextInt();

		if (x <= 3) {
			System.out.println("Значение выражения равно: " + (x * x - 3 * x + 9));
		} else if (x > 3) {
			System.out.println("Значение выражения равно: " + (1 / (Math.pow(x, 3) + 6)));
		}
	}
}
