package by.epam.jonline.task04.view;

import by.epam.jonline.task04.entity.Train;
import by.epam.jonline.task04.logic.TrainLogic;

import java.util.ArrayList;
import java.util.List;

public class TrainView {

    public static void trainInfo(List<Train> list) {
        int number = TrainLogic.enterFromConsole("Введите номер поезда");
        for (int i = 0; i < list.size() - 1; i++) {
            if (number == list.get(i).getNumber()) {
                System.out.println("Номер: " + list.get(i).getNumber() + ". Напрвление: " + list.get(i).getDestination() +
                        ". Время отправления: " + list.get(i).getDepartureTime());
            }
        }
    }

    public static void printArray(List<Train> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Номер: " + list.get(i).getNumber() + ". Напрвление: " + list.get(i).getDestination() +
                    ". Время отправления: " + list.get(i).getDepartureTime());
        }
    }
}
