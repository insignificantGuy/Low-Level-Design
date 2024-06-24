package wallet;

public class Transaction {
    private final String id;
    private final Account sourceAccount;
    private final Account destinationAccount;
    private final double amount;
    private final Currency currency;

    public Transaction(String id, Account sourceAccount, Account destinationAccount, double amount, Currency currency){
        this.id = id;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

}
