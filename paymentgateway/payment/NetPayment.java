package paymentgateway.payment;

import paymentgateway.BankType;

public class NetPayment extends Payment{
    private String netBankingID;
    private BankType bankType;
    private String netBankingPassword;

    public NetPayment(String netBankingID, BankType bankType, String netBankingPassword){
        this.netBankingID = netBankingID;
        this.bankType = bankType;
        this.netBankingPassword = netBankingPassword;
    }

    public String getNetBankingID(){
        return netBankingID;
    }

    public BankType getBankType(){
        return bankType;
    }

    public String getNetBankingPassword(){
        return netBankingPassword;
    }

    @Override
    public void makePayment(double amount){
        System.out.println("Deducting amount: "+amount);
        System.out.println("Bank : " + bankType.toString());
    }
    
}
