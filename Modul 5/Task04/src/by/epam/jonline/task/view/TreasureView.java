package by.epam.jonline.task.view;

import by.epam.jonline.task.bean.Cave;
import by.epam.jonline.task.bean.Treasure;
import by.epam.jonline.task.logic.TreasureLogic;
import by.epam.jonline.task.main.Main;


public class TreasureView {

    public static void printTreasureView(Cave cave){
        System.out.println("Список сокровищ:");
        for (Treasure treasure : cave.getTreasures()){
            System.out.println(treasure.toString());
        }
    }

    public static void printMoreExpensiveTreasure(){
        System.out.println(TreasureLogic.moreExpensiveTreasure(Main.cave));
    }
}
