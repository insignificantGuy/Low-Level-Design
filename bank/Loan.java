package bank;

public class Loan {
    double principle;
    double interest;
    int tenure;

    public Loan(double principle, double interest, int tenure){
        this.principle = principle;
        this.interest = interest;
        this.tenure = tenure;
    }

    public double calculateLoanAmount(){
        double interestRate = interest/(12*100);
        int numberOfMonths = tenure*12;
        double time = Math.pow((1+interestRate),numberOfMonths);

        return (principle*interestRate*time)/(time-1);
    }

    public double getTotalLoanAmount(){
        return calculateLoanAmount()*12*tenure;
    }
}
