package by.epam.jonline.task04.entity;

import java.util.Objects;

public class Time {
    private int hour;
    private int min;

    public Time(){

    }

    public Time(int hour, int min){
        this.hour = hour;
        this.min = min;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMin(int min){
        this.min = min;
    }

    public int getHour(){
        return hour;
    }

    public int getMin(){
        return min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour && min == time.min;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, min);
    }

    @Override
    public String toString() {
        String str = "";
        str = str + hour + " : " + min;
        return str;
    }
}
