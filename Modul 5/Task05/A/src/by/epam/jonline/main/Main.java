package by.epam.jonline.main;

import by.epam.jonline.bean.Flower;
import by.epam.jonline.bean.FlowerComposition;
import by.epam.jonline.bean.Wrap;
import by.epam.jonline.builder.FlowerBuilder;
import by.epam.jonline.builder.FlowerCompositionBuilder;
import by.epam.jonline.builder.WrapBuilder;
import by.epam.jonline.view.FlowerView;
import by.epam.jonline.view.WrapView;

public class Main {
    public static void main(String[] args) {

        Flower flower1 = new FlowerBuilder("Роза")
                .setColor("Красная")
                .setCount(5)
                .setPrice(4.5)
                .build();

        FlowerView flowerView = new FlowerView();
        flowerView.printInfo(flower1);

        Wrap wrap = new WrapBuilder()
                .setWrapType(Wrap.WrapType.GRID)
                .setPrice(2.0)
                .build();

        WrapView wrapView = new WrapView();
        wrapView.printInfo(wrap);

        FlowerComposition flowerComposition = new FlowerCompositionBuilder().addFlower(flower1).setWrap(wrap).build();
        System.out.println(flowerComposition);
        System.out.println(flowerComposition.getPrice());
    }
}
