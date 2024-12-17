package factory.tovarniMetoda;

abstract class Motorka {
    String motor;
    String typ;

    public void displayInfo() {
        System.out.println("Typ motorky: " + typ + ", Motor: " + motor);
    }
}
