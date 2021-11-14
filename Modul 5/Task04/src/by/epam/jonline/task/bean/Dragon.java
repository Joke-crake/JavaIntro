package by.epam.jonline.task.bean;

import java.util.Objects;

public class Dragon {
    private String name;
    private int countOfHeads;

    public Dragon(){

    }
    public Dragon(String name, int countOfHeads){
        this.name = name;
        this.countOfHeads = countOfHeads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfHeads() {
        return countOfHeads;
    }

    public void setCountOfHeads(int countOfHeads) {
        this.countOfHeads = countOfHeads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dragon dragon = (Dragon) o;
        return countOfHeads == dragon.countOfHeads && Objects.equals(name, dragon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfHeads);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", countOfHeads=" + countOfHeads +
                '}';
    }
}
