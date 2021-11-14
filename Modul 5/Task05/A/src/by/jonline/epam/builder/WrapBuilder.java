package by.jonline.epam.builder;

import by.jonline.epam.bean.Wrap;
import by.jonline.epam.bean.Wrap.WrapType;

public class WrapBuilder {
    private WrapType wrapType;
    private double price;

    public WrapBuilder setWrapType(WrapType wrapType){
        this.wrapType = wrapType;
        return this;
    }

    public WrapBuilder setPrice(double price){
        this.price = price;
        return this;
    }

    public Wrap build(){
        return new Wrap(wrapType, price);
    }
}
