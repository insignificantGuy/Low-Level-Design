package wallet;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final String id;
    private final User user;
    private final String accountNumber;
    private final Currency currency;
    private double balance;
    private List<Transaction> transaction;

    public Account(String id, User user, String accountNumber, Currency currency, double balance){
        this.id = id;
        this.user = user;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
        this.transaction = new ArrayList<>();
    }

    public void depositAmount(double amount){
        balance+=amount;
    }

    public void withdrawAmount(double amount){
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient fund");
        }
        balance-=amount;
        System.out.println("Withdrawn amount: " + amount);
    }

    public String getId(){
        return id;
    }

    public User getUser(){
        return user;
    }

    public String accountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public Currency getCurrency(){
        return currency;
    }

    public List<Transaction> getTransactionList(){
        return transaction;
    }

    public void addTransaction(Transaction transactions){
        transaction.add(transactions);
    }
}
