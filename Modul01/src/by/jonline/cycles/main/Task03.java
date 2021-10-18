package by.jonline.cycles.main;

//Найти сумму квадратов первых ста чисел.
public class Task03 {

	public static void main(String[] args) {
		int sum;
		sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("Сумма квадратов первых 100 чисел равна " + sum);
	}
}
