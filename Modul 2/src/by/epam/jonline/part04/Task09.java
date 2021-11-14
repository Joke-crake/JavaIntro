package by.epam.jonline.part04;

/*
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Task09 {
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;
		x = 3;
		y = 5;
		z = 8;
		t = 6;
		System.out.println("Площадь прямоугольника равна: " + square(x, y, z, t) + " кв.см.");
	}

	public static double square(int x, int y, int z, int t) {
		double hipotenuse;
		hipotenuse = Math.sqrt(x * x + y * y);
		double firstSquare;
		firstSquare = 1 / 2 * x * y;
		double p;
		p = (z + t + hipotenuse) / 2;
		double secondSquare;
		secondSquare = Math.sqrt(p * (p - z) * (p - t) * (p - hipotenuse));
		return firstSquare + secondSquare;
	}
}


