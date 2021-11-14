package by.epam.jonline.task.storage;

import by.epam.jonline.task.bean.Treasure;

import java.util.List;

public interface TreasureTxtStorage {
    public void loadTreasures(List<Treasure> treasures);
}
