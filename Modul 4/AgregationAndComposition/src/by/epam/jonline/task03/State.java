package by.epam.jonline.task03;

import java.util.ArrayList;

public class State {
    private String name;
    private String capitalOfState;
    private ArrayList<Region> regions;
    private float area;

    public State() {
    }

    public State(String name, String capitalOfState) {
        this.name = name;
        this.capitalOfState = capitalOfState;
        this.area = 0.0f;
        this.regions = new ArrayList<Region>();
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                ", area=" + area +
                '}';
    }

    public void printCapital() {
        if (capitalOfState != null) {
            System.out.println("Столица: " + capitalOfState);
        } else {
            System.out.println("Столица не задана");
        }
    }

    public void countOfRegions() {
        if (regions.size() > 0) {
            System.out.println("Количесто областей: " + regions.size());
        } else {
            System.out.println("Области не добавлены");
        }
    }

    public float area(ArrayList<Region> regions) {
        float area = 0.0f;
        for (Region c : regions) {
            area += c.getArea();
        }
        return area;
    }

    public void printArea(float area) {
        if (area > 0) {
            System.out.println("Площадь страны: " + area);
        } else {
            System.out.println("У страны нет площади");
        }
    }

    public void printRegionsCenters(ArrayList<Region> regions) {
        if (regions.size() > 0) {
            for (Region c : regions) {
                System.out.print(c.getCenterOfRegion() + ", ");
            }
        } else {
            System.out.println("Области не добавлены.");
        }
    }
}

