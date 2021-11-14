package by.epam.jonline.branching.main;

//дорешать
//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
public class Task03 {
	
	public static void main(String[] args) {
	
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		x1 = 1.5;
		x2 = 3;
		x3 = 8;
		y1 = 4;
		y2 = 2.3;
		y3 = 3.6;
		
		if ((x2 - x1) / (x3 - x1) == ((y2 - y1) / (y3 - y1))){
			System.out.println("Точки расположены на одной прямой");
		}else {
			System.out.println("Точки не на одной прямой");
		}
	}
}
