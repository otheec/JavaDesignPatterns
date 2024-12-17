package bank;

public class BankMVC {
    public static void main(String[] args) {
        BankAccount model = new BankAccount();
        new AccountView(model);
        new SummaryView(model);
    }
}
