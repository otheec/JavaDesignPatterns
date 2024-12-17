package factory.jednoduchaTovarna;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Auto suv = AutoFactory.createAuto("SUV");
        Auto sedan = AutoFactory.createAuto("Sedan");

        suv.displayInfo();
        sedan.displayInfo();
    }
}
