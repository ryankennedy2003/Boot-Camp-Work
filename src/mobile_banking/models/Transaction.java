package mobile_banking.models;

import java.util.Date;

public class Transaction {
    private Date transactionDate;
    private String transactionParty;
    private double amount;
    private double newBalance;

    public Transaction(Date transactionDate, String transactionParty, double amount, double newBalance) {
        this.transactionDate = transactionDate;
        this.transactionParty = transactionParty;
        this.amount = amount;
        this.newBalance = newBalance;
    }

    public String displayTransaction(){
        return transactionDate + " - " + transactionParty + " - " + amount + " - " + newBalance;

    }


}
