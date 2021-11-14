package by.epam.jonline.task08.logic;

import by.epam.jonline.task08.entity.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Logic {

    public List<Customer> getListByDiapasonOfCreditCards(int from, int to, List<Customer> listForSearch) {
        List<Customer> list = new ArrayList<>();
        for (Customer c : listForSearch) {
            if (c.getCreditCardNumber() >= from && c.getCreditCardNumber() <= to) {
                list.add(c);
            }
        }
        return list;
    }

    public List<Customer> getListByName(List<Customer> listForSort) {
        Collections.sort(listForSort, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return listForSort;
    }
}
