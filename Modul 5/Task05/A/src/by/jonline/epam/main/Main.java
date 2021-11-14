package by.jonline.epam.main;

import by.jonline.epam.bean.Flower;
import by.jonline.epam.bean.FlowerComposition;
import by.jonline.epam.bean.Wrap;
import by.jonline.epam.builder.FlowerBuilder;
import by.jonline.epam.builder.FlowerCompositionBuilder;
import by.jonline.epam.builder.WrapBuilder;
import by.jonline.epam.view.FlowerView;
import by.jonline.epam.view.WrapView;

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
