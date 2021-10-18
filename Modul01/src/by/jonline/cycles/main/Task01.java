package by.jonline.cycles.main;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1
// до введенного пользователем числа.
public class Task01 {

	public static void main(String[] args) {

		int x;
		int sum;

		sum = 0;
		x = 5;

		for (int i = 1; i <= x; i++) {
			sum += i;
		}

		System.out.println(sum);
	}
}
