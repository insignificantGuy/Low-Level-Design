package bank;

class Admin {
    public User createUser(String name, String userId){
        return new User(name, userId);
    }

    public Loan createNewLoan(User user, double principle, double interest, int tenure){
        return new Loan(principle,interest,tenure);
    }
}