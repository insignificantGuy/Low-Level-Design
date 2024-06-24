package paymentgateway;

import paymentgateway.payment.Payment;
import paymentgateway.payment.UPIPayment;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();
        Client client = new Client("Rahul");
        Payment payment = new UPIPayment("7982170123@paytm", "Paytm");
        System.out.println(client.getClientName());
        
        paymentGateway.addClient(client);
        paymentGateway.addSupportForPaymode(client, PaymentType.UPI, payment);
        paymentGateway.hasClient(client);
        paymentGateway.listSupportedPaymomde(client);
        paymentGateway.makePayment(10.00, client, PaymentType.UPI);
    }
}
