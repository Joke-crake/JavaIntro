package by.jonline.cycles.main;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int m;
		int n;

		System.out.println("введите m>> ");
		while (sc.hasNextInt() == false) {
			sc.nextLine();
			System.out.println("введите m>>");
		}
		m = sc.nextInt();
		System.out.println("Введите n > m");
		while (sc.hasNextInt() == false) {
			sc.nextLine();
			System.out.println(">>");
		}
		n = sc.nextInt();
		if (n > m) {
			for (int i = m; i <= n; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0 && i != j) {
						System.out.println("Для числа " + i + " делитель: " + j);
					}

				}

			}
		} else {
			System.out.println("Число m < n");
		}
	}
}
