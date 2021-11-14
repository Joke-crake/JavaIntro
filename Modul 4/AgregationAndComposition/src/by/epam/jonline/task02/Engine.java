package by.epam.jonline.task02;

import java.util.Objects;

public class Engine {
    private String engineType;
    private int volume;
    private int horsPower;
    private int countOfCylinders;

    public Engine() {

    }

    public Engine(String engineType, int volume, int horsPower, int countOfCylinders) {
        this.engineType = engineType;
        this.volume = volume;
        this.horsPower = horsPower;
        this.countOfCylinders = countOfCylinders;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHorsPower() {
        return horsPower;
    }

    public void setHorsPower(int horsPower) {
        this.horsPower = horsPower;
    }

    public int getCountOfCylinders() {
        return countOfCylinders;
    }

    public void setCountOfCylinders(int countOfCylinders) {
        this.countOfCylinders = countOfCylinders;
    }

    public void startEngine() {
        System.out.println("Двигатель запущен, можно ехать!");
    }

    public void stopEngine() {
        System.out.println("Двигатель остановлен, ехать нельзя!");
    }

    public String toString() {
        String str = "";
        str = str + "Тип двишателя: " + engineType + ", объем двигателя: " + volume + ", " + horsPower + " лошадиных сил, "
                + "количество цилиндров: " + countOfCylinders;
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return volume == engine.volume && horsPower == engine.horsPower && countOfCylinders == engine.countOfCylinders && Objects.equals(engineType, engine.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, volume, horsPower, countOfCylinders);
    }
}
