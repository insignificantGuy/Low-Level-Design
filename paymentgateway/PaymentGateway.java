package paymentgateway;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import paymentgateway.payment.Payment;

public class PaymentGateway {
    private List<Client>paymentgatewayClients;
    private List<Object>transactions;

    public PaymentGateway(){
        this.paymentgatewayClients = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public List<Client> getPaymentGatewayClients(){
        return paymentgatewayClients;
    }   

    public List<Object>getTransactions(){
        return transactions;
    }

    public void addClient(Client client){
        if(!paymentgatewayClients.contains(client)){
            paymentgatewayClients.add(client);
        }
        else{
            System.out.println("The Client " + client.getClientName() + " does not exist in the payment Gateway");
        }
    }

    public void removeClient(Client client){
        if(paymentgatewayClients.contains(client)){
            int index = paymentgatewayClients.indexOf(client);
            paymentgatewayClients.remove(index);
        }
        else{
            System.out.println("The Client " + client.getClientName() + " does not exist in the payment Gateway");
        }
    }

    public void hasClient(Client client){
        if(paymentgatewayClients.contains(client)){
            System.out.println("The client " + client.getClientName() + " exist in the Payment Gateway");
        }
        else{
            System.out.println("The client " + client.getClientName() + " does not exist in the Payment Gateway");
        }
    }

    public void listSupportedPaymomde(Client client){
        Map<PaymentType, List<Payment>> paymentMethod = client.getAllPaymentType();
        for(PaymentType currPaymentType: PaymentType.values()){
            if(paymentMethod.containsKey(currPaymentType)){
                System.out.println(currPaymentType.toString());
            }
        } 
    }

    public void addSupportForPaymode(Client client, PaymentType paymentType, Payment payment){
        client.addPaymentType(paymentType, payment);
        System.out.println("The payment type : " + paymentType.toString() + " has been added for the client " + client.getClientName());
    }

    public void makePayment(double amount, Client client, PaymentType paymentType){
        if(paymentgatewayClients.contains(client)){
            client.makePayment(amount, paymentType);
        }
        else{
            System.out.println("The Client " + client.getClientName() + " does not exist in the payment Gateway");
        }
    }
}
