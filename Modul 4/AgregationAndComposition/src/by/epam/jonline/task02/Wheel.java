package by.epam.jonline.task02;

public class Wheel {
    private String radius;
    private String typeOfSeasons;

    public Wheel() {

    }

    public Wheel(String radius, String typeOfSeasons) {
        this.radius = radius;
        this.typeOfSeasons = typeOfSeasons;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getTypeOfSeasons() {
        return typeOfSeasons;
    }

    public void setTypeOfSeasons(String typeOfSeasons) {
        this.typeOfSeasons = typeOfSeasons;
    }

    public String toString() {
        String str = "";
        str = str + "У колеса " + radius + " радиус," + "тип шины: " + typeOfSeasons;
        return str;
    }

    public void changeWheel(Wheel wheel) {
        this.radius = wheel.radius;
        this.typeOfSeasons = wheel.typeOfSeasons;
        System.out.println("Ура. Колесо поменяли!");
    }

}
