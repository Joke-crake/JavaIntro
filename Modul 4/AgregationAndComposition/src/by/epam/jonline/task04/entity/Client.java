package by.epam.jonline.task04.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private String passportId;
    private ArrayList<BankAccount> bankAccounts;

    public Client() {
        name = null;
        surname = null;
        passportId = null;
        bankAccounts = new ArrayList<BankAccount>();
    }

    public Client(String name, String surname, String passportId) {
        this.name = name;
        this.surname = surname;
        this.passportId = passportId;
        bankAccounts = new ArrayList<BankAccount>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(passportId, client.passportId) && Objects.equals(bankAccounts, client.bankAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, passportId, bankAccounts);
    }

    public String toString() {
        String str = "";
        str = str + "Имя: " + name + ", фамилия: " + surname + ", номер паспорта: " + passportId + ", список счетов"
                + bankAccounts.toString();
        return str;
    }
}
