package by.epam.jonline.task02;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
вывести на консоль марку автомобиля.
 */
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Бензиновый", 2, 168,4);
        Wheel wheel = new Wheel("17", "Летняя");
        Car car = new Car(engine, wheel, 4, "Audi");

        car.printBrand();
        car.driveCar();
        car.fillTheCar();
        car.stopCar();
        car.changeWheel(wheel,3);
    }
}
