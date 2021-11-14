package by.epam.jonline.task06;

/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Main {
    public static void main(String[] args) {
        Time time = new Time(12, 50, 30);
        time.showTime();
        time.setMinutes(43);
        time.showTime();
        time.setSeconds(70);
        time.showTime();
        time.addHour(13);
        time.addMinutes(12);
        time.addSeconds(15);
        time.showTime();
    }
}
