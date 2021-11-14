package by.epam.jonline.task04.logic;

import by.epam.jonline.task04.entity.BankAccount;
import by.epam.jonline.task04.entity.Client;

import java.util.ArrayList;

public class BankAccountLogic {

    public void setStatusAccount(BankAccount bankAccount) {
        if (bankAccount.getBalance() > 0) {
            bankAccount.setOpen(true);
        } else {
            bankAccount.setOpen(false);
        }
    }

    public double sumBalancePositive(Client client) {
        double sum = 0;
        ArrayList<BankAccount> bankAccounts = client.getBankAccounts();
        for (BankAccount bankAccount1 : bankAccounts) {
            if (bankAccount1.isOpen()) {
                sum += bankAccount1.getBalance();
            }
        }
        return sum;
    }

    public double sumBalanceNegative(Client client) {
        double sum = 0;
        ArrayList<BankAccount> bankAccounts = client.getBankAccounts();
        for (BankAccount bankAccount1 : bankAccounts) {
            if (!bankAccount1.isOpen()) {
                sum += Math.abs(bankAccount1.getBalance());
            }
        }
        return -sum;
    }
}
