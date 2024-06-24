package paymentgateway.payment;

public class UPIPayment extends Payment{
    private String upiId;
    private String serviceProvider;

    public UPIPayment(String upiId, String serviceProvider){
        this.upiId = upiId;
        this.serviceProvider = serviceProvider;
    }

    @Override
    public void makePayment(double amount){
        System.out.println("Activating UPI Payment from : " + serviceProvider);
        System.out.println("Deducting amount : " + amount + " from UPI ID : " + upiId);
    }
}
