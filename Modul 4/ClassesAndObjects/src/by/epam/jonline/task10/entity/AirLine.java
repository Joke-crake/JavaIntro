package by.epam.jonline.task10.entity;

import java.util.Arrays;
import java.util.Objects;

public class AirLine {
    private String destination;
    private int number;
    private String typeOfPlane;
    private Time time;
    private String[] daysOfWeek;

    public AirLine(String destination, int number, String typeOfPlane, Time time, String[] daysOfWeek) {
        this.destination = destination;
        this.number = number;
        this.typeOfPlane = typeOfPlane;
        this.time = time;
        this.daysOfWeek = daysOfWeek;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", typeOfPlane='" + typeOfPlane + '\'' +
                ", time=" + time +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirLine airLine = (AirLine) o;
        return number == airLine.number && Objects.equals(destination, airLine.destination) && Objects.equals(typeOfPlane, airLine.typeOfPlane) && Objects.equals(time, airLine.time) && Arrays.equals(daysOfWeek, airLine.daysOfWeek);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(destination, number, typeOfPlane, time);
        result = 31 * result + Arrays.hashCode(daysOfWeek);
        return result;
    }
}

