package by.epam.jonline.task04.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depo {
    private List<Train> trains;

    {
        trains = new ArrayList<Train>();
    }

    public Depo() {

    }

    public Depo(int n) {

    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    @Override
    public String toString() {
        return "Depo{" +
                "trains=" + trains +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depo depo = (Depo) o;
        return Objects.equals(trains, depo.trains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trains);
    }
}
