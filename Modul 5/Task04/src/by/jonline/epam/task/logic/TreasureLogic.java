package by.jonline.epam.task.logic;

import by.jonline.epam.task.bean.Cave;
import by.jonline.epam.task.bean.Treasure;

public class TreasureLogic {

    public static Treasure moreExpensiveTreasure(Cave cave){
        Treasure moreExpensiveTreasure = cave.getTreasures().get(0);
        for (Treasure treasure : cave.getTreasures()){
            if(treasure.getCost() > moreExpensiveTreasure.getCost()){
                moreExpensiveTreasure = treasure;
            }
        }
        return moreExpensiveTreasure;
    }

    public static void treasuresForSum(Cave cave, int sum){
        int currentSum = 0;
        System.out.println("Сокровища на сумму: " + sum);
        for(Treasure treasure : cave.getTreasures()){
            if(currentSum + treasure.getCost() <= sum ){
                System.out.println(treasure);
                currentSum += treasure.getCost();
            }
        }

    }
}
