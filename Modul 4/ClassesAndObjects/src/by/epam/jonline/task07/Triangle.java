package by.epam.jonline.task07;

import java.util.Objects;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA() {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()),2));
    }

    public double getSideB() {
        return Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()),2));
    }

    public double getSideC() {
        return Math.sqrt(Math.pow((c.getX() - a.getX()), 2) + Math.pow((c.getY() - a.getY()),2));
    }

    public double perimetr() {
        return this.getSideA() + this.getSideB() + this.getSideC();
    }

    public double area() {
        double p = perimetr() / 2;
        return Math.sqrt(p * (p - this.getSideA()) * (p - this.getSideB()) * (p - this.getSideC()));
    }

    public void isCorrectTriangle() {
        double sideA = getSideA();
        double sideB = getSideB();
        double sideC = getSideC();

        if (sideA * sideB * sideC == 0 || sideA + sideB <= sideC || sideA + sideC <= sideB || sideC + sideB <= sideA) {
            System.out.println("Треугольник не существует");
        } else {
            System.out.println("Треугольник существует");
        }
    }

    public Point medianOfTriangle() {
        return new Point((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
    }

    public void print() {
        System.out.println("x: " + a.getX() + ", y: " + a.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(a, triangle.a) && Objects.equals(b, triangle.b) && Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
