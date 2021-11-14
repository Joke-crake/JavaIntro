package by.epam.jonline.task05;

import java.util.Objects;

public class Count {
    private int min;
    private int max;
    private int counter;

    public Count(int min, int max, int delta) {
        this.min = min;
        this.max = max;
        this.counter = delta;
    }

    public Count() {
        min = 0;
        max = 60;
        counter = 1;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getCounter() {
        return counter;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increase() {
        if (this.counter < this.max) {
            this.counter++;
        } else {
            System.out.println("Достигли масимального значения");
        }
    }

    public void reduce() {
        if (this.counter > this.min) {
            this.counter--;
        } else {
            System.out.println("Достигли минимального значения");
        }
    }

    public void showInfo() {
        System.out.println("Текущее значение счетчика: " + this.getCounter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return min == count.min && max == count.max && counter == count.counter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, counter);
    }

    @Override
    public String toString() {
        return "Count{" +
                "min=" + min +
                ", max=" + max +
                ", counter=" + counter +
                '}';
    }
}
