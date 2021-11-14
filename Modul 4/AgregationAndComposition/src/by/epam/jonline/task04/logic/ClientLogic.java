package by.epam.jonline.task04.logic;

import by.epam.jonline.task04.entity.BankAccount;
import by.epam.jonline.task04.entity.Client;

public class ClientLogic {

    public void addCBankAccount(Client client, BankAccount bankAccount) {
        client.getBankAccounts().add(bankAccount);
    }

}
