package bank;

public class BankEMI {

    public void displayEMI(User user, Loan loan){
        double emi = loan.calculateLoanAmount();
        double totalAmount = loan.getTotalLoanAmount();

        System.out.println("User with userId: " + user.getUserId() + " and name : "+user.getName());
        System.out.println("EMI: "+emi);
        System.out.println("Total Amount Payable: "+ totalAmount);
    }

    public static void main(String[] args){
        Admin admin = new Admin();
        BankEMI bankEmi = new BankEMI();

        User user = admin.createUser("John Doe", "12345");
        Loan loan = admin.createNewLoan(user, 10000, 8, 12);
        bankEmi.displayEMI(user, loan);
    }
}
