package by.epam.jonline.task04.main;
/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать
 поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и
 отрицательный балансы отдельно.
 */
import by.epam.jonline.task04.entity.Bank;
import by.epam.jonline.task04.entity.BankAccount;
import by.epam.jonline.task04.entity.Client;
import by.epam.jonline.task04.logic.BankAccountLogic;
import by.epam.jonline.task04.logic.BankLogic;
import by.epam.jonline.task04.logic.ClientLogic;
import by.epam.jonline.task04.view.ClientView;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClientLogic clientLogic = new ClientLogic();
        BankLogic bankLogic = new BankLogic();
        BankAccountLogic bankAccountLogic = new BankAccountLogic();
        ClientView clientView = new ClientView();
        Bank bank = new Bank("Белагропромбанк");
        Client client1 = new Client("Сергей", "Кокошкин", "НВ123456");
        BankAccount bankAccount1 = new BankAccount(-4800, "12_13_15_87", false);
        BankAccount bankAccount2 = new BankAccount(-800, "14_95_85_25", false);
        clientLogic.addCBankAccount(client1, bankAccount1);
        clientLogic.addCBankAccount(client1, bankAccount2);
        bankLogic.addClient(bank, client1);

        Client client2 = new Client("Илья", "Бондарев", "НВ546989");
        BankAccount bankAccount3 = new BankAccount(300, "89_11_10_85", true);
        BankAccount bankAccount4 = new BankAccount(600, "41_65_45_39", true);
        clientLogic.addCBankAccount(client2, bankAccount3);
        clientLogic.addCBankAccount(client2, bankAccount4);
        bankLogic.addClient(bank, client2);

        Client clientWithPassportId;
        clientWithPassportId = bankLogic.searchClientByPassport("НВ546989", bank.getClients());
        clientView.print("Клиент с номером паспорта НВ546989: ", clientWithPassportId);

        clientView.print("Изначальный список клиентов", bank.getClients());

        ArrayList<Client> sortedClientsList;
        sortedClientsList = bankLogic.sortedClients(bank.getClients());
        clientView.print("Отсортированный список клиентов", sortedClientsList);

        double client2PositiveSum;
        client2PositiveSum = bankAccountLogic.sumBalancePositive(client2);
        System.out.println("Сумма баланса:" + client2PositiveSum);

        double client1NegativeSum;
        client1NegativeSum = bankAccountLogic.sumBalanceNegative(client1);
        System.out.println("Сумма баланса:" + client1NegativeSum);
    }
}
