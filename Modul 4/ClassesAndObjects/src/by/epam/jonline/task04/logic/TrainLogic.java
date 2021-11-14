package by.epam.jonline.task04.logic;

import by.epam.jonline.task04.entity.Train;


import java.util.List;
import java.util.Scanner;

public class TrainLogic {

    public static void sortOfDestination(List<Train> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getDestination().charAt(0) > list.get(j + 1).getDestination().charAt(0)) {
                    list.add(j, list.get(j + 1));
                    list.remove(j + 2);
                }
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getDestination().equalsIgnoreCase(list.get(j + 1).getDestination())) {
                    if(list.get(j).getDepartureTime().getHour() > list.get(j + 1).getDepartureTime().getHour() || (list.get(j).getDepartureTime().getHour() ==
                            list.get(j + 1).getDepartureTime().getHour() && list.get(j).getDepartureTime().getMin() > list.get(j + 1).getDepartureTime().getMin()) ){
                        Train temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }
    }

    public static void sortByNumber(List<Train> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getNumber() > list.get(j + 1).getNumber()) {
                    list.add(j, list.get(j + 1));
                    list.remove(j + 2);
                }
            }
        }
    }

    public static int enterFromConsole(String message) {
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.println("Введите номер поезда >>");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введите номер поезда >>");
        }
        value = sc.nextInt();
        return value;
    }
}
