package by.epam.jonline.lineprogram.main;

/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
*/
public class Task05 {

    public static void main(String[] args) {

        int t;
        int hour;
        int min;
        int sec;

        t = 5623;

        hour = t / 3600;
        min = t / 60 % 60;
        sec = t % 60;

        System.out.println(hour + " часов " + min + " минут " + sec + " секунд");
    }
}
