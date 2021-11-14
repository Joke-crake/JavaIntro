package by.epam.jonline.task.bean;

import java.util.Objects;

public abstract class Treasure {
    private String name;
    private int cost;


    public Treasure(){

    }
    public Treasure(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return cost == treasure.cost && Objects.equals(name, treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Украшение:" +
                " Название: " + name +
                ", цена: " + cost;
    }
}
