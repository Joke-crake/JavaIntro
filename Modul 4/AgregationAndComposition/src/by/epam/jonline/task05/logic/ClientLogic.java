package by.epam.jonline.task05.logic;

import by.epam.jonline.task05.entity.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClientLogic {
    public void sortedListBySurnameClient(ArrayList<Client> clientArrayListForSort) {
        Collections.sort(clientArrayListForSort, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
    }
}
