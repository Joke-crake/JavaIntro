package by.epam.jonline.view;

import by.epam.jonline.bean.Flower;

import java.util.Locale;

public class FlowerView {

    public void printInfo(Flower flower){

        System.out.println("Информация о цветах в букете: \n"
                + "Имя цветка: " + flower.getName().toLowerCase(Locale.ROOT)
                + ", цвет цветков: " + flower.getColor().toLowerCase(Locale.ROOT)
                + ", количество этих цветков в букете: " + flower.getCount()
                + ", стоимость одного цветка: " + flower.getPrice());
    }
}
