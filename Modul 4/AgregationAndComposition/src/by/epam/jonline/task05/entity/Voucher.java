package by.epam.jonline.task05.entity;

import java.util.Objects;

public class Voucher {
    private String country;
    private int countOfDays;
    private double price;
    private String transportType;
    private String foodType;
    private String voucherType;

    public Voucher() {
        country = null;
        countOfDays = 0;
        price = 0.0d;
        transportType = null;
        foodType = null;
        voucherType = null;
    }

    public Voucher(String country, int countOfDays, double price, String transportType, String foodType, String voucherType) {
        this.country = country;
        this.countOfDays = countOfDays;
        this.price = price;
        this.transportType = transportType;
        this.foodType = foodType;
        this.voucherType = voucherType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getVoucherType() {
        return voucherType;
    }

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher vouchers = (Voucher) o;
        return countOfDays == vouchers.countOfDays && Double.compare(vouchers.price, price) == 0 && Objects.equals(country, vouchers.country) && Objects.equals(transportType, vouchers.transportType) && Objects.equals(foodType, vouchers.foodType) && Objects.equals(voucherType, vouchers.voucherType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, countOfDays, price, transportType, foodType, voucherType);
    }

    public String toString() {
        String str = "";
        str = str + "Путевка: страна - " + country + ", тип отдыха: " + voucherType + ", количество дней: " + countOfDays + ", стоимость: " + price
                + ", транспорт: " + transportType + ", питание: " + foodType;
        return str;
    }
}
