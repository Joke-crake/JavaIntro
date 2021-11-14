package by.epam.jonline.logic;

import by.epam.jonline.bean.Flower;
import by.epam.jonline.bean.FlowerComposition;

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
