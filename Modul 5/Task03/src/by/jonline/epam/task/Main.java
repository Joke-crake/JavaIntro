package by.jonline.epam.task;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.addDate(new Calendar.Date("07.01.2022", Calendar.Date.DataType.HOLIDAY));
        calendar.addDate(new Calendar.Date("05.02.2022", Calendar.Date.DataType.WEEKEND));
        calendar.addDate(new Calendar.Date("03.07.2022", Calendar.Date.DataType.HOLIDAY));

        calendar.printCalendarInfo();


    }

}
