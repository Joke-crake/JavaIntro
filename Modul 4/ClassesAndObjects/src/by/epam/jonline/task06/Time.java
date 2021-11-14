package by.epam.jonline.task06;

import java.util.Objects;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public void showTime() {
        System.out.println(this.getHour() + " часов, " + this.getMinutes() + " минут, " + this.getSeconds() + " секунд.");
    }

    public void addHour(int hour) {
        int change;
        change = this.getHour() + hour;
        if (change >= 0 && change <= 24) {
            this.hour = change;
        } else {
            this.hour = 0;
        }
    }

    public void addMinutes(int minutes) {
        int change;
        change = this.getMinutes() + minutes;
        if (change >= 0 && change <= 59) {
            this.minutes = change;
        } else {
            this.minutes = 0;
        }
    }

    public void addSeconds(int seconds) {
        int change;
        change = this.getSeconds() + seconds;
        if (change >= 0 && change <= 59) {
            this.seconds = change;
        } else {
            this.seconds = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour && minutes == time.minutes && seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
