package atm;

public class CashDispenser {
    private int cashAvailable;

    public CashDispenser(int cashAvailable){
        this.cashAvailable = cashAvailable;
    }

    public synchronized void disperseCash(int amount){
        if(amount>cashAvailable){
            throw new IllegalArgumentException("Insufficient Balance");
        }
        cashAvailable-=amount;
        System.out.println("Dispensing Cash : "+ amount);
    }
}
