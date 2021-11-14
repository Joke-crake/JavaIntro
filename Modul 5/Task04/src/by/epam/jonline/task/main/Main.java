package by.epam.jonline.task.main;

import by.epam.jonline.task.bean.Cave;
import by.epam.jonline.task.bean.Dragon;
import by.epam.jonline.task.consoleAction.CaseMenu;
import java.util.Scanner;

/*
Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона. Реализовать
возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.
 */

public class Main {
    public static Dragon dragon = new Dragon("Горыныч", 3);
    public static Cave cave = new Cave("Пещера", dragon);

    public static void main(String[] args) {

        new CaseMenu(new Scanner(System.in)).start();




    }
}
