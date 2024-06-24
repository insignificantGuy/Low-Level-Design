package wallet;

public class Main {
    public static void main(String[] args){
        DigitalWallet digitalWallet = new DigitalWallet();

        User user1 = new User("John", "12345","abc@gmail.com","123456");
        User user2 = new User("John2", "23456","def@gmail.com","456789");

        Account account1 = new Account("12345", user1, "1234567890", Currency.IND, 10000);
        Account account2 = new Account("23456", user2, "9876543210", Currency.USD, 100);

        double account1Balance = account1.getBalance();
        double account2Balance = account2.getBalance();

        System.out.println("Account 1 has a balance of "+ account1Balance);
        System.out.println("Account 2 has a balance of "+ account2Balance);

        digitalWallet.addAccount(account1);
        digitalWallet.addAccount(account2);

        digitalWallet.transferFunds(account1, account2, 1000, Currency.IND);

        account1Balance = account1.getBalance();
        account2Balance = account2.getBalance();

        System.out.println("Account 1 has a balance of "+ account1Balance);
        System.out.println("Account 2 has a balance of "+ account2Balance);
    }
}
