package by.epam.jonline.task04.main;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные
в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте
возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив по
пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */
import by.epam.jonline.task04.entity.Depo;
import by.epam.jonline.task04.entity.Time;
import by.epam.jonline.task04.entity.Train;
import by.epam.jonline.task04.logic.TrainLogic;
import by.epam.jonline.task04.view.TrainView;


public class Main {
    public static void main(String[] args) {
        Depo depo = new Depo();

        depo.addTrain(new Train("Витебск", 647, new Time(21,9)));
        depo.addTrain(new Train("Гродно", 620, new Time(16,47)));
        depo.addTrain(new Train("Минск", 164, new Time(12,4)));
        depo.addTrain(new Train("Гомель", 365, new Time(13,22)));
        depo.addTrain(new Train("Гомель", 367, new Time(12,20)));
        depo.addTrain(new Train("Могилев", 420, new Time(9,31)));

        System.out.println("Поезда");
        TrainView.printArray(depo.getTrains());
        TrainLogic.sortByNumber(depo.getTrains());
        System.out.println("Поезда, отсортированные по номеру.");
        TrainView.printArray(depo.getTrains());

        System.out.println("Поиск поезда по номеру");
        TrainView.trainInfo(depo.getTrains());

        System.out.println("Сортировка по направлению");
        TrainLogic.sortOfDestination(depo.getTrains());
        TrainView.printArray(depo.getTrains());
    }
}

