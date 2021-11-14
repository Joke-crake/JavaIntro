package by.epam.jonline.task04.entity;

import java.util.Objects;

public class Train {
    private String destination;
    private int number;
    private Time departureTime;

    public Train() {

    }

    public Train(String destination, int number, Time departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDeparture_time(Time departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number && Objects.equals(destination, train.destination) && Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, number, departureTime);
    }
}
