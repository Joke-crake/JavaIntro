package by.jonline.epam.bean;

public class Wrap {
    private WrapType wrapType;
    private double price;

    public Wrap(){
        wrapType = null;
        price = 0.0;
    }

    public Wrap(WrapType wrapType, double price){
        this.wrapType = wrapType;
        this.price = price;
    }

    public WrapType getWrapType(){
        return wrapType;
    }

    public double getPrice(){
        return price;
    }

    public static enum WrapType{
        MEMBRANE("Пленка"),
        PAPER("Бумажная"),
        GRID("Сетка"),
        FELT("Фетр");
        private final String value;

        private WrapType(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }

    }

    @Override
    public String toString() {
        return "Wrap{" +
                "wrapType=" + wrapType +
                ", price=" + price +
                '}';
    }
}

