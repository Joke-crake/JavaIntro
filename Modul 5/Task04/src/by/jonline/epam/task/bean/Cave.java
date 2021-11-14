package by.jonline.epam.task.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave {
    private String name;
    private List<Treasure> treasures;
    private Dragon dragon;

    public Cave(){

    }

    public Cave(String name){
        this.name = name;
        this.treasures = new ArrayList<>();
        this.dragon = new Dragon();
    }

    public Cave(String name, Dragon dragon){
        this.name = name;
        this.treasures = new ArrayList<>();
        this.dragon = new Dragon();
    }

    public void addTreasure(Treasure treasure){
        treasures.add(treasure);
    }

    public void deleteTreasure(Treasure treasure){
        treasures.remove(treasure);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave cave = (Cave) o;
        return Objects.equals(name, cave.name) && Objects.equals(treasures, cave.treasures) && Objects.equals(dragon, cave.dragon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, treasures, dragon);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "name='" + name + '\'' +
                ", treasures=" + treasures +
                ", dragon=" + dragon +
                '}';
    }
}
