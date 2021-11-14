package by.epam.jonline.task01;

/*
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных.
 */
public class Main {

    public static void main(String[] args) {
        Test1 object = new Test1();
        object.setA(7);
        object.setB(6);
        object.print(object.getA(), object.getB());
        int sum = object.sum();
        int max = object.max();
        System.out.println("sum " + sum);
        System.out.println("max " + max);
        object.setA(4);
        object.setB(2);
        int sum1 = object.sum();
        int max1 = object.max();
        object.print(object.getA(), object.getB());
        System.out.println("sum " + sum1);
        System.out.println("max " + max1);
    }
}
