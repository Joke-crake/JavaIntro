package by.epam.jonline.task10.entity;

import java.util.Objects;

public class Time {
    private int hour;
    private int minute;

    public Time() {

    }

    public Time(int hour, int minute) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minute > 0 && minute < 59) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

    public String toString() {
        String str = "";
        str = str + hour + ":" + minute;
        return str;
    }
}

