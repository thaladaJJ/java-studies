package entities;

public final class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount () {
        super();
    }
    public SavingsAccount (Integer number, String holder, Double balance, double interestRate) {
        super (number, holder, balance);
        this.balance = balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance () {
        balance += balance * interestRate;
    }
    @Override
    public void withdraw (Double amount) {
        balance -= amount;
    }
}