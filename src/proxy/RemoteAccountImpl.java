package proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteAccountImpl extends UnicastRemoteObject implements RemoteAccount {
    private Account account;

    public RemoteAccountImpl() throws RemoteException {
        account = new Account();
    }

    @Override
    public void deposit(double amount) throws RemoteException {
        account.deposit(amount);
        System.out.println("Vklad: " + amount + " Kč. Nový zůstatek: " + account.getBalance() + " Kč.");
    }

    @Override
    public void withdraw(double amount) throws RemoteException {
        try {
            account.withdraw(amount);
            System.out.println("Výběr: " + amount + " Kč. Nový zůstatek: " + account.getBalance() + " Kč.");
        } catch (Exception e) {
            System.out.println("Pokus o přečerpání účtu.");
            throw new RemoteException("Přečerpání účtu");
        }
    }

    @Override
    public double getBalance() throws RemoteException {
        return account.getBalance();
    }
}

