package paymentgateway.payment;

public class CardPayment extends Payment{
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String name;

    public CardPayment(String cardNumber, String expiryDate, String cvv, String name){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.name = name;
    }

    @Override
    public void makePayment(double amount){
        System.out.println("Deducting amount : " + amount);
        System.out.println("Card Holder Name : " + name);
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public String getCvv(){
        return cvv;
    }
}
