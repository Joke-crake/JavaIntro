package by.epam.jonline.view;

import by.epam.jonline.bean.Wrap;

import java.util.Locale;

public class WrapView {

    public void printInfo(Wrap wrap){
        System.out.println("Информаци об обертке: \n"
                + "материал обертки: " + wrap.getWrapType().getValue().toLowerCase(Locale.ROOT)
                + ", Стоимость обертки: " + wrap.getPrice());
    }
}
