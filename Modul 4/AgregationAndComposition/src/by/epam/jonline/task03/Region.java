package by.epam.jonline.task03;

import java.util.ArrayList;

public class Region {
    private String name;
    private String centerOfRegion;
    private ArrayList<District> citiesOfDistrict;
    private int area;

    public Region() {

    }

    public Region(String name, String centerOfRegion) {
        this.name = name;
        this.citiesOfDistrict = new ArrayList<District>();
        this.centerOfRegion = centerOfRegion;
        this.area = area(citiesOfDistrict);
    }

    public Region(String name, String centerOfRegion, ArrayList<District> citiesOfDistrict, int area) {
        this.name = name;
        this.centerOfRegion = centerOfRegion;
        this.citiesOfDistrict = new ArrayList<District>();
        this.area = area(citiesOfDistrict);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCenterOfRegion() {
        return centerOfRegion;
    }

    public void setCenterOfRegion(String centerOfRegion) {
        this.centerOfRegion = centerOfRegion;
    }

    public ArrayList<District> getCitiesOfDistrict() {
        return citiesOfDistrict;
    }

    public void setCitiesOfDistrict(ArrayList<District> citiesOfDistrict) {
        this.citiesOfDistrict = citiesOfDistrict;
    }

    public void addDistrict(District district) {
        citiesOfDistrict.add(district);
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", centerOfRegion='" + centerOfRegion + '\'' +
                ", citiesOfDistrict=" + citiesOfDistrict +
                ", area=" + area +
                '}';
    }

    public int area(ArrayList<District> districts) {
        int area = 0;
        for (District c : districts) {
            area += c.getArea();
        }
        return area;
    }

}

