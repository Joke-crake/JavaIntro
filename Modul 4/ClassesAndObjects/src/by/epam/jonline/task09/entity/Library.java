package by.epam.jonline.task09.entity;

import java.util.*;

public class Library {

    private ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBookToListOfBooks(Book book) {
        listOfBooks.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(listOfBooks, library.listOfBooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfBooks);
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfBooks=" + listOfBooks +
                '}';
    }
}

