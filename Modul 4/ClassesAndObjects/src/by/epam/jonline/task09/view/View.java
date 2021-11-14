package by.epam.jonline.task09.view;


import by.epam.jonline.task09.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class View {

    public void print(String message, List<Book> books) {
        System.out.println(message);
        for (Book c : books) {
            System.out.println(c);
        }
    }
}
