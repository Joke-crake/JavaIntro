package by.epam.jonline.task05;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в
заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код,
демонстрирующий все возможности класса.
 */
public class Main {
    public static void main(String[] args) {
        Count counter = new Count();
        //текущее значение
        counter.showInfo();
        //+4
        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase();
        //значение после +4
        counter.showInfo();
        //-1
        counter.reduce();
        //значение после -1
        counter.showInfo();
    }
}
