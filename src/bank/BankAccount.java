package bank;

import javax.swing.*;
import java.util.Observable;

public class BankAccount extends Observable {
    private double balance = 0;
    private double totalDeposits = 0;
    private double totalWithdrawals = 0;

    public double getBalance() {
        return balance;
    }

    public double getTotalDeposits() {
        return totalDeposits;
    }

    public double getTotalWithdrawals() {
        return totalWithdrawals;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalDeposits += amount;
            setChanged();
            notifyObservers();
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            totalWithdrawals += amount;
            setChanged();
            notifyObservers();
        } else {
            JOptionPane.showMessageDialog(null, "Nedostatek prostředků!", "Chyba", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void reset() {
        balance = 0;
        totalDeposits = 0;
        totalWithdrawals = 0;
        setChanged();
        notifyObservers();
    }

}
