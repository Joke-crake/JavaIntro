package by.epam.jonline.task.logic;

import by.epam.jonline.task.bean.Cave;
import by.epam.jonline.task.storage.TreasureStorage;

public class CaveLogic {

    public static void loadTreasuresFromFile(Cave cave){
        TreasureStorage treasureStorage = new TreasureStorage();
        treasureStorage.loadTreasures(cave.getTreasures());
    }
}
