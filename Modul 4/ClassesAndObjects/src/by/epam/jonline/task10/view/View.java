package by.epam.jonline.task10.view;

import by.epam.jonline.task10.entity.AirLine;

import java.util.List;

public class View {

    public void print(String message, List<AirLine> schedule) {
        System.out.println(message);
        for (AirLine c : schedule) {
            System.out.println(c);
        }
    }
}
