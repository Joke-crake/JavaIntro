package by.epam.jonline.cycles.main;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид.
public class Task05 {
	public static void main(String[] args) {
		double a;
		double e;
		int n;
		double result;

		n = 12;
		e = 0.1;
		result = 0;

		for (int i = 1; i <= n; i++) {
			a = (1 / Math.pow(2, i) + 1 / Math.pow(3, i));
			if (Math.abs(a) >= e) {
				result += a;
			}
		}
		System.out.println(result);
	}
}
