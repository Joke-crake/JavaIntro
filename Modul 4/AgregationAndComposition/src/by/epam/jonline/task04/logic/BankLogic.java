package by.epam.jonline.task04.logic;

import by.epam.jonline.task04.entity.Bank;
import by.epam.jonline.task04.entity.Client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BankLogic {

    public void addClient(Bank bank, Client client) {
        bank.getClients().add(client);
    }

    public Client searchClientByPassport(String passportId, ArrayList<Client> clientsForSerach) {
        for (Client client : clientsForSerach) {
            if (client.getPassportId().equalsIgnoreCase(passportId)) {
                return client;
            }
        }
        return null;
    }

    public ArrayList<Client> sortedClients(ArrayList<Client> clientsForSort) {
        Collections.sort(clientsForSort, new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        return clientsForSort;
    }
}
