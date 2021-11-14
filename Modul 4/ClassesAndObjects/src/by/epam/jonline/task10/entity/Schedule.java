package by.epam.jonline.task10.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Schedule {
    private String nameOfAirport;
    private ArrayList<AirLine> schedule;

    {
        schedule = new ArrayList<AirLine>();
    }

    public String getNameOfAirport() {
        return nameOfAirport;
    }

    public void setNameOfAirport(String nameOfAirport) {
        this.nameOfAirport = nameOfAirport;
    }

    public ArrayList<AirLine> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<AirLine> schedule) {
        this.schedule = schedule;
    }

    public Schedule(String nameOfAirport) {
        this.nameOfAirport = nameOfAirport;
    }

    public void addAirLineToSchedule(AirLine airLine) {
        schedule.add(airLine);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule1 = (Schedule) o;
        return Objects.equals(nameOfAirport, schedule1.nameOfAirport) && Objects.equals(schedule, schedule1.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAirport, schedule);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "nameOfAirport='" + nameOfAirport + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
