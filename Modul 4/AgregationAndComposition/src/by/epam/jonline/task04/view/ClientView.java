package by.epam.jonline.task04.view;

import by.epam.jonline.task04.entity.Client;

import java.util.ArrayList;

public class ClientView {

    public void print(String message, ArrayList<Client> client) {
        System.out.println(message);
        for (Client c : client) {
            System.out.println(c);
        }
    }

    public void print(String message, Client client) {
        System.out.println(message + client);
    }
}
