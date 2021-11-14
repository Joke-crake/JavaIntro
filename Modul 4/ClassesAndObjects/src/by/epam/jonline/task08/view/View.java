package by.epam.jonline.task08.view;

import by.epam.jonline.task08.entity.Customer;

import java.util.List;

public class View {
    public void print(String message, List<Customer> listForPrint) {
        System.out.println(message);
        for (Customer c : listForPrint) {
            System.out.println(c);
        }
    }
}
