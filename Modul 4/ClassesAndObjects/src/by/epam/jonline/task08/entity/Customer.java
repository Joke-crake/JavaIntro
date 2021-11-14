package by.epam.jonline.task08.entity;

import java.util.Objects;

public class Customer {
    private int id;
    private static int ID;
    private String name;
    private String patronymic;
    private String adress;
    private int creditCardNumber;
    private String bankAccountNumber;

    public Customer() {
        id = 0;
        name = null;
        patronymic = null;
        adress = null;
        creditCardNumber = 0;
        bankAccountNumber = null;
    }

    public Customer(String name, String patronymic, String adress, int creditCardNumber, String bankAccountNumber) {
        id = ID++;
        this.name = name;
        this.patronymic = patronymic;
        this.adress = adress;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getAdress() {
        return this.adress;
    }

    public int getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && creditCardNumber == customer.creditCardNumber && Objects.equals(name, customer.name) && Objects.equals(patronymic, customer.patronymic) && Objects.equals(adress, customer.adress) && Objects.equals(bankAccountNumber, customer.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, patronymic, adress, creditCardNumber, bankAccountNumber);
    }

    public String toString() {
        String string = " ";
        string = string + id + ":" + name + " " + patronymic + ". " + adress + " : " + creditCardNumber + " : " + bankAccountNumber;
        return string;
    }


}
