package by.epam.jonline.task10.main;
/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import by.epam.jonline.task10.entity.AirLine;
import by.epam.jonline.task10.entity.Schedule;
import by.epam.jonline.task10.entity.Time;
import by.epam.jonline.task10.logic.Logic;
import by.epam.jonline.task10.view.View;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Schedule schedule = new Schedule("Minsk-1");
        Logic logic = new Logic();
        View view = new View();
        schedule.addAirLineToSchedule(new AirLine("Батуми", 875, "Boeing737300", new Time(11, 49), new String[]{"Понедельник", "Среда", "Пятница"}));
        schedule.addAirLineToSchedule(new AirLine("Сочи", 313, "Boeing737100", new Time(14, 12), new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница"}));
        schedule.addAirLineToSchedule(new AirLine("Москва", 465, "ТУ-154", new Time(17, 49), new String[]{"Понедельник", "Пятница"}));
        schedule.addAirLineToSchedule(new AirLine("Киев", 897, "SSJ 100/95", new Time(17, 21), new String[]{"Понедельник", "Среда"}));
        schedule.addAirLineToSchedule(new AirLine("Ростов на Дону", 125, "AirBus A320", new Time(12, 35), new String[]{"Понедельник", "Среда", "Пятница"}));

        List<AirLine> allSchedule;
        allSchedule = schedule.getSchedule();
        view.print("Все расписание", allSchedule);

        String destination = "Сочи";
        List<AirLine> inDestination;
        inDestination = logic.getListOfDestination(destination, schedule.getSchedule());
        view.print("Рейсы в " + destination, inDestination);

        List<AirLine> inSomeDays;
        inSomeDays = logic.getListFlightsOfDay("Пятница", schedule.getSchedule());
        view.print("В пятницу", inSomeDays);

        List<AirLine> inDayAfterTime;
        inDayAfterTime = logic.getListFlightsOfDayAndTime(logic.getListFlightsOfDay("Понедельник", schedule.getSchedule()), new Time(14, 00));
        view.print("В понедельник после 14:00", inDayAfterTime);
    }
}


