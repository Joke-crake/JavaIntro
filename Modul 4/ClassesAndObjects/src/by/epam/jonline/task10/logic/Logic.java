package by.epam.jonline.task10.logic;

import by.epam.jonline.task10.entity.AirLine;
import by.epam.jonline.task10.entity.Time;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public Logic() {

    }

    public List<AirLine> getListOfDestination(String destination, List<AirLine> scheduleForSearch) {
        List<AirLine> searchedDestinations = new ArrayList<>();
        for (AirLine c : scheduleForSearch) {
            if (destination.equals(c.getDestination())) {
                searchedDestinations.add(c);
            }
        }
        return searchedDestinations;
    }

    public List<AirLine> getListFlightsOfDay(String nameOfDay, List<AirLine> schedule) {
        List<AirLine> result = new ArrayList<>();
        for (AirLine c : schedule) {
            for (int i = 0; i < c.getDaysOfWeek().length; i++) {
                if (c.getDaysOfWeek()[i].equals(nameOfDay)) {
                    result.add(c);
                }
            }
        }
        return result;
    }

    public List<AirLine> getListFlightsOfDayAndTime(List<AirLine> getListFlightsOfDay, Time time) {
        List<AirLine> result = new ArrayList<>();
        for (AirLine c : getListFlightsOfDay) {
            if (c.getTime().getHour() >= time.getHour() && c.getTime().getMinute() > time.getMinute()) {
                result.add(c);
            }
        }
        return result;
    }
}
