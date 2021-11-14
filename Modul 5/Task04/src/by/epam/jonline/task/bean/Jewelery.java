package by.epam.jonline.task.bean;

import java.util.Objects;

public class Jewelery extends Treasure{
    private JeweleryType jeweleryType;

    public Jewelery(){
    }

    public Jewelery(String name, int cost, JeweleryType jeweleryType){
        super(name, cost);
        this.jeweleryType = jeweleryType;
    }

    public JeweleryType getJeweleryType() {
        return jeweleryType;
    }

    public void setJeweleryType(JeweleryType jeweleryType) {
        this.jeweleryType = jeweleryType;
    }

    public static enum JeweleryType{
        EARRING("Серьги"),
        PENDANT("Подвеска"),
        RING("Кольцо");
        private String value;
        JeweleryType(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Jewelery jewelery = (Jewelery) o;
        return jeweleryType == jewelery.jeweleryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jeweleryType);
    }

    @Override
    public String toString() {
        return
                super.toString() + " Украшение: " +
                "тип украшения: " + jeweleryType.value;
    }
}
