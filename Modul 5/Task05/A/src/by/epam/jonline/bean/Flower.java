package by.epam.jonline.bean;

public class Flower {
    private final String name;
    private final String color;
    private final double price;
    private final int count;

    public Flower(){
        name = "";
        color = "";
        price = 0.0;
        count = 0;
    }

    public Flower(String name, String color, double price, int count){
        this.name = name;
        this.color = color;
        this.price = price;
        this.count = count;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public double getPrice(){
        return this.price;
    }

    public int getCount(){
        return this.count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (Double.compare(flower.price, price) != 0) return false;
        if (count != flower.count) return false;
        if (name != null ? !name.equals(flower.name) : flower.name != null) return false;
        return color != null ? color.equals(flower.color) : flower.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + count;
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

}
