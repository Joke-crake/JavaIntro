package by.epam.jonline.lineprogram.main;
/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class Task04 {

	public static void main(String[] args) {

		double x;
		double result;

		x = 123.856;
		
		result = (x * 1000) % 1000 + (int) x / 1000.0;

		System.out.println(result);
	}
}
