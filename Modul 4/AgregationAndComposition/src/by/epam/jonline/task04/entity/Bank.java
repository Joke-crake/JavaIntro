package by.epam.jonline.task04.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Client> clients;

    public Bank() {
        name = null;
        clients = new ArrayList<Client>();
    }

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) && Objects.equals(clients, bank.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clients);
    }

    public String toString() {
        String str = "";
        str = str + "Название банка: " + name + ", список клиентов: " + clients;
        return str;
    }
}
