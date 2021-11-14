package by.epam.jonline.task02;

import java.util.Arrays;

public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private String brandAuto;

    public Car() {

    }

    public Car(Engine engine, Wheel wheel, int countOfWheels, String brandAuto) {
        this.engine = engine;
        this.wheels = new Wheel[countOfWheels];
        for (int i = 0; i < countOfWheels; i++) {
            wheels[i] = wheel;
        }
        this.brandAuto = brandAuto;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public String getBrandAuto() {
        return brandAuto;
    }

    public void setBrandAuto(String brandAuto) {
        this.brandAuto = brandAuto;
    }

    public void fillTheCar() {
        System.out.println("Мы заправили бак.");
    }

    public void driveCar() {
        engine.startEngine();
        System.out.println("Мы едем!");
    }

    public void stopCar() {
        engine.stopEngine();
        System.out.println("Ехать нельзя");
    }

    public void changeWheel(Wheel wheel, int numberOfWheel) {
        if (numberOfWheel > 0 && numberOfWheel <= wheels.length) {
            wheels[numberOfWheel - 1].changeWheel(wheel);
        }
        System.out.println("Поменяли 3 колесо.");
    }

    public void printBrand() {
        System.out.println(brandAuto);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", brandAuto='" + brandAuto + '\'' +
                '}';
    }
}
