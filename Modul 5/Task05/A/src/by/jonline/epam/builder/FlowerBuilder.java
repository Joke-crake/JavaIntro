package by.jonline.epam.builder;

import by.jonline.epam.bean.Flower;

public class FlowerBuilder {
    private String name;
    private String color;
    private double price;
    private int count;

    public FlowerBuilder (String name){
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("У цветка должно быть имя");
        }else {
            this.name = name;
        }
    }

    public FlowerBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public FlowerBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public FlowerBuilder setCount(int count){
        this.count = count;
        return this;
    }

    public Flower build(){
        return new Flower(name, color, price, count);
    }

    @Override
    public String toString() {
        return "FlowerBuilder{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
