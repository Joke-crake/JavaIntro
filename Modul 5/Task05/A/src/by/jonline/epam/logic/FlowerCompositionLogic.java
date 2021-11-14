package by.jonline.epam.logic;

import by.jonline.epam.bean.Flower;
import by.jonline.epam.bean.FlowerComposition;

public class FlowerCompositionLogic {

    public double getPriceOfBouquet(FlowerComposition flowerComposition){
        double price = 0.0;
        for(Flower flower : flowerComposition.getFlowers()){
            price += flower.getPrice() * flower.getCount();
        }
        price += flowerComposition.getWrap().getPrice();
        return price;
    }
}
