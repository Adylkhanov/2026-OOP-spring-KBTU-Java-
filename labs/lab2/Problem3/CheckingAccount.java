package labs.lab2.Problem3;

public class CheckingAccount extends Account {

    private int transactionCount;
    private static int freeTransaction = 3;
    private static double transactionFee = 0.5;

    public CheckingAccount(int Accnumber) {
        super(Accnumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        if (transactionCount > freeTransaction) {
            int notFreeTransactions = transactionCount - freeTransaction;
            double totalFee = notFreeTransactions * transactionFee;
            super.withdraw(totalFee);
            transactionCount = 0;
        } else {
            System.out.println("Do you have a free transactions");
            System.out.print(freeTransaction - transactionCount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount #" + getAccountNumber() + " [Balance: " + getBalance() + "]";
    }

    @Override 
    public void update(){
        this.deductFee();
    }



}
