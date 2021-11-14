package by.epam.jonline.task03;

import java.util.ArrayList;

public class District {
    private String name;
    private int area;
    private String centerOfDistrict;
    private ArrayList<City> cities;

    public District() {
    }

    public District(String name, int area, String centerOfDistrict) {
        this.name = name;
        this.area = area;
        this.cities = new ArrayList<City>();
        this.centerOfDistrict = centerOfDistrict;
    }

    public District(String name, int area, String centerOfDistrict, ArrayList<City> cities) {
        this.name = name;
        this.area = area;
        this.centerOfDistrict = centerOfDistrict;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCenterOfDistrict() {
        return centerOfDistrict;
    }

    public void setCenterOfDistrict(String centerOfDistrict) {
        this.centerOfDistrict = centerOfDistrict;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public void addCity(City city) {
        cities.add(city);


    }

    public String toString() {
        String str = "";
        str = str + "Район: " + name + ", районный центр: " + centerOfDistrict + ", площадь района: " + area + " тыс. кв. км"
                + ", список городов" + cities;
        return str;
    }


}
