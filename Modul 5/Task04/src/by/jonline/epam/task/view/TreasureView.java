package by.jonline.epam.task.view;

import by.jonline.epam.task.bean.Cave;
import by.jonline.epam.task.bean.Treasure;
import by.jonline.epam.task.logic.TreasureLogic;
import by.jonline.epam.task.main.Main;


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
