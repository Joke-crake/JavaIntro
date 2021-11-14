package by.jonline.epam.task.logic;

import by.jonline.epam.task.bean.Cave;
import by.jonline.epam.task.storage.TreasureStorage;

public class CaveLogic {

    public static void loadTreasuresFromFile(Cave cave){
        TreasureStorage treasureStorage = new TreasureStorage();
        treasureStorage.loadTreasures(cave.getTreasures());
    }
}
