package by.epam.jonline.task04.entity;

import java.util.Objects;

public class BankAccount {
    private static int ID;
    private int id;
    private double balance;
    private String bankAccountNumber;
    private boolean isOpen = false;

    public BankAccount() {
        id = 0;
        balance = 0.0;
        bankAccountNumber = null;
        isOpen = true;
    }

    public BankAccount(double balance, String bankAccountNumber, boolean isOpen) {
        id = ID++;
        this.balance = balance;
        this.bankAccountNumber = bankAccountNumber;
        this.isOpen = isOpen;
    }

    public void blockAccount() {
        this.isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void unblockAccount() {
        this.isOpen = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return id == that.id && Double.compare(that.balance, balance) == 0 && isOpen == that.isOpen && Objects.equals(bankAccountNumber, that.bankAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, bankAccountNumber, isOpen);
    }

    public String toString() {
        String str = "";
        str = str + "id = " + id + ", номер счета: " + bankAccountNumber + ", баланс счета: " + balance
                + ", состояние счета: " + isOpen;
        return str;
    }
}
