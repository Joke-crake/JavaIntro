package by.epam.jonline.branching.main;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
// пройдет ли кирпич через отверстие.
public class Task04 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int x;
		int y;
		int z;
		//задаем размеры отверстия а и b
		a = 7;
		b = 8;
		//задаем размеры кирпича x,y,z
		x = 9;
		y = 6;
		z = 7;
		
		if ((a > x && b > y) || (a > y && b > x)) {
			System.out.println("Кирпич пройдет в отверстие");
		}else if ((a > x && b > z) || (a > z && b > x)) {
			System.out.println("Кирпич пройдет в отверстие");
		}else if ((a > y && b > z) || (a > z && b > y)) {
			System.out.println("Кирпич пройдет в отверстие");
		}else {
			System.out.println("Кирпич не пройдет");
		}
	}
}
