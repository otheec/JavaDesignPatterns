package proxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteAccountClient {
    private RemoteAccount remoteAccount;

    public RemoteAccountClient() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            remoteAccount = (RemoteAccount) registry.lookup("RemoteAccount");
            System.out.println("Připojení k vzdálenému účtu úspěšné.");
        } catch (Exception e) {
            System.out.println("Nepodařilo se připojit k serveru.");
            e.printStackTrace();
        }
    }

    public void deposit(double amount) {
        try {
            remoteAccount.deposit(amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdraw(double amount) {
        try {
            remoteAccount.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printBalance() {
        try {
            System.out.println("Aktuální zůstatek: " + remoteAccount.getBalance() + " Kč.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

