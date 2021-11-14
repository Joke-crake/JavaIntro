package by.epam.jonline.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Calendar {
    private List<Date> dates;

    public Calendar (){
        this.dates = new ArrayList();
    }

    public void addDate(Date date){
        this.dates.add(date);
    }

    public void deleteDate(Date date){
        this.dates.remove(date);
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }
    public void printCalendarInfo(){
            for (Date date : dates){
                System.out.println(date.printDateInfo());
            }
    }

    public static class Date{
        private String date;
        private DataType dataType;

        public static enum DataType{
            WEEKEND("Выходной"), HOLIDAY("Праздник"), WEEKDAY("Будний");
            private String value;

            DataType(String value) {
                this.value = value;
            }
            public String getValue(){
                return this.value;
            }
        }

        public Date (String date, DataType dataType){
            this.date = date;
            this.dataType = dataType;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public DataType getDataType() {
            return dataType;
        }

        public void setDataType(DataType dataType) {
            this.dataType = dataType;
        }
        public String printDateInfo(){
            String s = "";
            s = s + "Дата: " + date + ", тип дня: " + dataType.value;
            return s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Date date1 = (Date) o;
            return Objects.equals(date, date1.date) && dataType == date1.dataType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(date, dataType);
        }

        @Override
        public String toString() {
            return "Date{" +
                    "date='" + date + '\'' +
                    ", dataType=" + dataType +
                    '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(dates, calendar.dates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dates);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dates=" + dates +
                '}';
    }
}
