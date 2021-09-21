package mobile_banking.models;

import java.util.ArrayList;

public class Account {
    private String accountType;
    private String accountName;
    private double balance;
    private ArrayList<Transaction> transactions;
    private int accountNumber;
    private int sortCode;


    public Account(String accountType, String accountName, double balance, ArrayList<Transaction> transactions, int accountNumber, int sortCode) {
        this.accountType = accountType;
        this.accountName = accountName;
        this.balance = balance;
        this.transactions = transactions;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(Transaction transactions) {
        this.transactions.add(transactions);
    }
}
