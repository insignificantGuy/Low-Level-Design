package paymentgateway;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import paymentgateway.payment.Payment;

public class Client {
    private String name;
    private Map<PaymentType, List<Payment>>paymentMethods;

    public Client(String name){
        this.name = name;
        this.paymentMethods = new HashMap<>();
    }

    public String getClientName(){
        return name;
    }

    public Map<PaymentType, List<Payment>> getAllPaymentType(){
        return paymentMethods;
    }

    public void addPaymentType(PaymentType paymentType, Payment payment){
        if(!paymentMethods.containsKey(paymentType)){
            paymentMethods.put(paymentType, new ArrayList<>());
            paymentMethods.get(paymentType).add(payment);
        }
        else{
            paymentMethods.get(paymentType).add(payment);
            System.out.println("You have already added Payment Type : " + paymentType.toString() + " to your list");
        }
    }

    public void removePaymode(PaymentType paymentType){
        if(paymentMethods.containsKey(paymentType)){
           paymentMethods.remove(paymentType);
        }
        else{
            System.out.println("You have successfully removed Payment Type : " + paymentType.toString() + " from your preferences");
        }
    }

    public void makePayment(double amount, PaymentType paymentType){
        List<Payment> payments = paymentMethods.get(paymentType);
        if(payments!=null){
            Payment payment = payments.get(0);
            payment.makePayment(amount);
        }
        else{
            System.out.println("The user has not opted for " + paymentType.toString() + " as a payment method");
        }
    }
}
