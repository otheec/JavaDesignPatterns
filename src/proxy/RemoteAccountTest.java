package proxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteAccountTest {
    public static void main(String[] args) {
        try {
            RemoteAccountImpl account = new RemoteAccountImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("RemoteAccount", account);
            System.out.println("Vzdálený server účtu je spuštěn...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

