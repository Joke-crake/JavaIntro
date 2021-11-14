package by.epam.jonline.task05.entity;

import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private String phoneNumber;
    private Voucher voucher;

    public Client() {
        name = null;
        surname = null;
        phoneNumber = null;
        voucher = null;
    }

    public Client(String name, String surname, String phoneNumber, Voucher voucher) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.voucher = voucher;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(phoneNumber, client.phoneNumber) && Objects.equals(voucher, client.voucher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber, voucher);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", voucher=" + voucher +
                '}';
    }
}
