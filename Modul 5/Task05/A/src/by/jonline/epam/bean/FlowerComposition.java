package by.jonline.epam.bean;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposition {
    private List<Flower> flowers;
    private Wrap wrap;
    private double price;

    public FlowerComposition(){
        this.flowers = new ArrayList<Flower>();
        this.wrap = null;
        this.price = 0;
    }

    public FlowerComposition(List<Flower> flowers, Wrap wrap, double price){
        this.flowers = flowers;
        this.wrap = wrap;
        this.price = price;
    }

    public void addFlower(Flower flower){
        this.flowers.add(flower);
    }

    public List<Flower> getFlowers(){
        return this.flowers;
    }

    public Wrap getWrap(){
        return this.wrap;
    }

    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "FlowerComposition{" +
                "flowers=" + flowers +
                ", wrap=" + wrap +
                ", price=" + price +
                '}';
    }
}
