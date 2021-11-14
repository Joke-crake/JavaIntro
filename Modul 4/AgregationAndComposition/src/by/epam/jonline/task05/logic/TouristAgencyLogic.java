package by.epam.jonline.task05.logic;

import by.epam.jonline.task05.entity.Client;
import by.epam.jonline.task05.entity.Voucher;

import java.util.ArrayList;

public class TouristAgencyLogic {

    public void addClient(Client clientAddToList, ArrayList<Client> listForAdd) {
        listForAdd.add(clientAddToList);
    }

    public void addVoucher(Voucher voucherAddToList, ArrayList<Voucher> listForAdd) {
        listForAdd.add(voucherAddToList);
    }
}
