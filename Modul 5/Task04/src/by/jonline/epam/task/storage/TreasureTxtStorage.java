package by.jonline.epam.task.storage;

import by.jonline.epam.task.bean.Treasure;

import java.util.List;

public interface TreasureTxtStorage {
    public void loadTreasures(List<Treasure> treasures);
}
