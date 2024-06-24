package atm;

public class ATM {
    private final BankingService bankingService;
    private final CashDispenser cashDispenser;
    private int transactionID;

    public ATM(BankingService bankingService, CashDispenser cashDispenser){
        this.bankingService = bankingService;
        this.cashDispenser = cashDispenser;
        this.transactionID = 0;
    }

    public double checkBalance(String accountNumber){
        Account account = bankingService.getAccount(accountNumber);
        return account.getBalance();
    }

    public void withdrawCash(String accountNumber, double amount){
        Account account = bankingService.getAccount(accountNumber);
        Transaction transaction = new WithdrawalTransaction(generateTransactionId(), account, amount);
        transaction.execute();
        cashDispenser.disperseCash((int)amount);
    }

    public void depositCash(String accountNumber, double amount){
        Account account = bankingService.getAccount(accountNumber);
        Transaction transaction = new DepositTransaction(generateTransactionId(), account, amount);
        transaction.execute();
    }

    private String generateTransactionId(){
        transactionID++;
        return String.valueOf(transactionID);
    }
}
