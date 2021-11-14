package by.epam.jonline.task09.logic;

import by.epam.jonline.task09.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public List<Book> getListOfBookScience(int year, List<Book> listOfBooksForSearch) {
        List<Book> result = new ArrayList<>();
        for (Book c : listOfBooksForSearch) {
            if (c.getYear() >= year) {
                result.add(c);
            }
        }
        return result;
    }

    public List<Book> getListOfBookOfPublishingHouse(String publichingHouse, List<Book> listOfBooksForSearch) {
        List<Book> result = new ArrayList<>();
        for (Book c : listOfBooksForSearch) {
            if (c.getPublishingHouse().equalsIgnoreCase(publichingHouse)) {
                result.add(c);
            }
        }
        return result;
    }

    public List<Book> getListOfAuthor(String author, List<Book> listOfBooksForSearch) {
        List<Book> list = new ArrayList<>();
        for (Book c : listOfBooksForSearch) {
            if (author.equals(c.getAuthor())) {
                list.add(c);
            }
        }
        return list;
    }
}
