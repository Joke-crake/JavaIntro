package by.jonline.epam.builder;

import by.jonline.epam.bean.Flower;
import by.jonline.epam.bean.FlowerComposition;
import by.jonline.epam.bean.Wrap;

import java.util.ArrayList;
import java.util.List;

public class FlowerCompositionBuilder {
    private List<Flower> flowers = new ArrayList<>();
    private Wrap wrap;
    private double price;

    public FlowerCompositionBuilder addFlower(Flower flower){
        this.flowers.add(flower);
        this.price += flower.getPrice() * flower.getCount();
        return this;
    }

    public FlowerCompositionBuilder setWrap(Wrap wrap){
        this.wrap = wrap;
        this.price += wrap.getPrice();
        return this;
    }

    public FlowerComposition build(){
        return new FlowerComposition(flowers, wrap, price);
    }
}
