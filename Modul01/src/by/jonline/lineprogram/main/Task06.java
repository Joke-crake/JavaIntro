package by.jonline.lineprogram.main;

/*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */
public class Task06 {

	public static void main(String[] args) {

		double x;
		double y;

		x = 1.9;
		y = 4.1;

		System.out.println(x >= -4 && x <= 4 && y <= 4 && y >= -3);
	}
}
