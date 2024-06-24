package wallet;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DigitalWallet {
    private final Map<String,User> user;
    private final Map<String, Account> account;
    
    public DigitalWallet(){
        user = new HashMap<>();
        account = new HashMap<>();
    }

    public void createUser(User newUser){
        user.put(newUser.getId(), newUser);
    }

    public void addAccount(Account newAccount){
        account.put(newAccount.getId(), newAccount);
        newAccount.getUser().addAccount(newAccount);
    }

    public User getUser(User newUser){
        return user.get(newUser.getId());
    }

    public Account getAccount(Account newAccount){
        return account.get(newAccount.getId());
    }

    public void transferFunds(Account sourceAccount, Account destinationAccount, double amount, Currency currency){
        if(sourceAccount.getCurrency()!=currency){
            amount = CurrencyConverter.convert(amount, currency, sourceAccount.getCurrency());
        }
        sourceAccount.withdrawAmount(amount);
        if(destinationAccount.getCurrency()!=currency){
            amount = CurrencyConverter.convert(amount, currency, destinationAccount.getCurrency());
        }

        destinationAccount.depositAmount(amount);

        String transactionID = UUID.randomUUID().toString();
        Transaction transaction = new Transaction(transactionID, sourceAccount, destinationAccount, amount, currency);
        sourceAccount.addTransaction(transaction);
        destinationAccount.addTransaction(transaction);
    }
}
