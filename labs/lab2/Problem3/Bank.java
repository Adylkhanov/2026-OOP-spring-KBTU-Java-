package labs.lab2.Problem3;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(int NumberAccount) {
        accounts.remove(NumberAccount);
    }

    public void update() {
        for (Account acc : accounts) {
            acc.update();
        }
    }

    public void displayAccounts() {
        for (Account acc : accounts) {
            acc.print();
        }
    }

}
