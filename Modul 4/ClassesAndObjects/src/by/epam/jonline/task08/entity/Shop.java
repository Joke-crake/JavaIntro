package by.epam.jonline.task08.entity;

import java.util.*;

public class Shop {
    private String shopName;
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public void addCostumerToShopList(Customer customer) {
        customerList.add(customer);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(shopName, shop.shopName) && Objects.equals(customerList, shop.customerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopName, customerList);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", customerList=" + customerList +
                '}';
    }
}
