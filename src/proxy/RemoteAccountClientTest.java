package proxy;

public class RemoteAccountClientTest {
    public static void main(String[] args) {
        RemoteAccountClient client = new RemoteAccountClient();

        client.printBalance();
        client.deposit(1000);
        client.printBalance();
        client.withdraw(500);
        client.printBalance();
        client.withdraw(600); // Tento výběr způsobí přečerpání účtu
        client.printBalance();
    }
}
