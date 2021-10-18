package by.jonline.cycles.main;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task04 {
	public static void main(String[] args) {
		long result;
		result = 1;

		long c;
		c = 1;
		for (int i = 2; i <= 200;) {
			c = c * i * i;
			if(c <= 9223372036854775807L && c > 0) {
				result = c;
				i++;
			}else{
				System.out.println("На итерации " + i + " произведение превышает допустимое значение типа long");
				break;
			}
		}
		System.out.println("Последний результат: " + result);
	}
}
