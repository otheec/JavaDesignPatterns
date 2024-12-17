package proxy;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance - amount < 0) {
            throw new Exception("Přečerpání účtu");
        }
        balance -= amount;
    }
}
