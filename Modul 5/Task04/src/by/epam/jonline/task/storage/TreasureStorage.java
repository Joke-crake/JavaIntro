package by.epam.jonline.task.storage;

import by.epam.jonline.task.bean.Jewelery;
import by.epam.jonline.task.bean.Money;
import by.epam.jonline.task.bean.Treasure;

import java.io.*;
import java.util.List;

public class TreasureStorage implements TreasureTxtStorage{
    private File file;
    private String separate = ", ";

    {
        file = new File("E://Epam/JavaOnlineTraining/Modul05/Task04/source", "Treasure.txt");
    }

    @Override
    public void loadTreasures(List<Treasure> treasures) {
        treasures.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s = "";

            while((s = reader.readLine())!= null){
                String[] info = s.split(separate);
                Treasure treasure= null;
                if(info[0].equalsIgnoreCase("украшение")){
                    if(info[2].equalsIgnoreCase("серьги")){
                        treasure = new Jewelery(info[1], Integer.parseInt(info[3]), Jewelery.JeweleryType.EARRING);
                    }
                    if(info[2].equalsIgnoreCase("кольцо")){
                        treasure = new Jewelery(info[1], Integer.parseInt(info[3]), Jewelery.JeweleryType.RING);
                    }
                    if(info[2].equalsIgnoreCase("подвеска")){
                        treasure = new Jewelery(info[1], Integer.parseInt(info[3]), Jewelery.JeweleryType.PENDANT);
                    }
                }
                if(info[0].equalsIgnoreCase("деньги")){
                    if(info[2].equalsIgnoreCase("бумажные деньги")){
                        treasure = new Money(info[1], Integer.parseInt(info[3]), Money.MoneyType.PAPER_MONEY);
                    }
                    if(info[2].equalsIgnoreCase("монета")){
                        treasure = new Money(info[1], Integer.parseInt(info[3]), Money.MoneyType.COIN);
                    }
                }
                treasures.add(treasure);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
