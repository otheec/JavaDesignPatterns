package factory.jednoduchaTovarna;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        Auto suv = AutoFactory.createAuto(SUV.class);
        Auto kombi = AutoFactory.createAuto(Kombi.class);
        Auto sedan = AutoFactory.createAuto(Sedan.class);
        Auto mini = AutoFactory.createAuto(Mini.class);

        suv.displayInfo();
        kombi.displayInfo();
        sedan.displayInfo();
        mini.displayInfo();
    }
}
