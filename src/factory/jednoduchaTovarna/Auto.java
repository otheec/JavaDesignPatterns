package factory.jednoduchaTovarna;

public abstract class Auto {
    String motor;
    String pohonKol;
    double spotreba;

    public void displayInfo() {
        System.out.println("Motor: " + motor + ", Pohon kol: " + pohonKol + ", Spotřeba: " + spotreba + " l/100km");
    }
}