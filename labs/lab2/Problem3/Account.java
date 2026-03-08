package labs.lab2.Problem3;

public class Account {

    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accNumber;
    }

    public void transfer(double amount, Account other) {
        if (this.balance >= amount) {
            this.withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Not enough balance to transfer!");
        }
    }

    public String toString() {
        return "Account " + accNumber + ": Balance = " + balance;

    }

    public final void print() {
        System.out.println(toString());
    }

    public void update() {

    }

}
