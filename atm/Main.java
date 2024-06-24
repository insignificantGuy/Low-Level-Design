package atm;

public class Main {
    public static void main(String[] args){
        BankingService bankingService = new BankingService();
        CashDispenser cashDispenser = new CashDispenser(10000);
        ATM atm = new ATM(bankingService, cashDispenser);

        bankingService.createAccount("1234567890", 1000);

        double balance = atm.checkBalance("1234567890");
        System.out.println("Balance: "+ balance);

        atm.withdrawCash("1234567890", 1000);
        atm.depositCash("1234567890", 500);

        double newBalance = atm.checkBalance("1234567890");
        System.out.println("Balance after all transaction is : " + newBalance);
    }
}
