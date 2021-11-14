package by.epam.jonline.task03;

public class City {
    private String city;
    private int countOfPeople;

    public City() {

    }

    public City(String city, int countOfPeople) {
        this.city = city;
        this.countOfPeople = countOfPeople;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public void setCountOfPeople(int countOfPeople) {
        this.countOfPeople = countOfPeople;
    }

    public String toString() {
        String str = "";
        str = str + "Город: " + city + ", количество населения: " + countOfPeople + " человек";
        return str;
    }
}
