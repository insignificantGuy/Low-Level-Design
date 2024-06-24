package atm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BankingService {
    private final Map<String,Account> accounts = new ConcurrentHashMap<>();
    
    public void createAccount(String accountNumber, double balance){
        Account newAccount = new Account(accountNumber, balance);
        accounts.put(accountNumber, newAccount);
    }

    public Account getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }
}
