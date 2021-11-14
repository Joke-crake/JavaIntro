package by.epam.jonline.task07;

/*
7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
периметра и точки пересечения медиан.
 */

public class Main {
    public static void main(String[] args) {
        Point a = new Point(3, 6);
        Point b = new Point(4, 8);
        Point c = new Point(7, 9);

        Triangle triangle = new Triangle(a, b, c);

        System.out.println("площадь " + triangle.area());
        System.out.println("периметр " + triangle.perimetr());
        System.out.println("медиана " + triangle.medianOfTriangle());
    }
}
