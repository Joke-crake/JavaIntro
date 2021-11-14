package by.epam.jonline.task05.view;

import by.epam.jonline.task05.entity.Voucher;

import java.util.ArrayList;

public class VoucherView {
    public void printStringList(ArrayList<String> listForPrint) {
        int i = 1;
        for (String list : listForPrint) {
            System.out.println(i + ". " + list);
            i++;
        }
    }

    public void printIntegerList(ArrayList<Integer> listForPrint) {
        int i = 1;
        for (Integer list : listForPrint) {
            System.out.println(i + ". " + list);
            i++;
        }
    }

    public void printVouchers(ArrayList<Voucher> vouchersForPrint) {
        int i = 1;
        for (Voucher voucher : vouchersForPrint) {
            System.out.println(i + ". " + voucher);
            i++;
        }
    }
}
