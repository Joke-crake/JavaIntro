package by.epam.jonline.task09.entity;

import java.util.Objects;

public class Book {
    private int id;
    private static int ID;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberOfpages;
    private int price;
    private String bindingType;

    public Book(String name, String author, String publishingHouse, int year, int numberOfpages, int price, String bindingType) {
        id = ID++;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfpages = numberOfpages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public void setNumberOfpages(int numberOfpages) {
        this.numberOfpages = numberOfpages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public static int getId() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && year == book.year && numberOfpages == book.numberOfpages && price == book.price && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(publishingHouse, book.publishingHouse) && Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publishingHouse, year, numberOfpages, price, bindingType);
    }

    public String toString() {
        String string = "";
        string = string + id + ", " + name + ", " + author + " : " + publishingHouse + " : " + year + " : " + numberOfpages + " : " + price + " : " + bindingType;
        return string;

    }
}
