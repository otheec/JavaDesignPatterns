package proxy;

import java.io.Serializable;

public class Koruny implements Serializable {
    private static final long serialVersionUID = 1L;
    private double amount;

    public Koruny(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%.2f Kč", amount);
    }
}

