package by.epam.jonline.task05.entity;

import java.util.ArrayList;
import java.util.Objects;

public class TouristAgency {
    private String name;
    private ArrayList<Client> clients;
    private ArrayList<Voucher> vouchers;

    public TouristAgency() {
        name = null;
        clients = null;
        vouchers = null;
    }

    public TouristAgency(String name) {
        this.name = name;
        this.clients = new ArrayList<Client>();
        this.vouchers = new ArrayList<Voucher>();
    }

    public TouristAgency(String name, ArrayList<Client> clients, ArrayList<Voucher> vouchers) {
        this.name = name;
        this.clients = clients;
        this.vouchers = vouchers;

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

    public ArrayList<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(ArrayList<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TouristAgency that = (TouristAgency) o;
        return Objects.equals(name, that.name) && Objects.equals(clients, that.clients) && Objects.equals(vouchers, that.vouchers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clients, vouchers);
    }

    @Override
    public String toString() {
        return "TouristAgency{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                ", vouchers=" + vouchers +
                '}';
    }
}
