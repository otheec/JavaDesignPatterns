package factory.tovarniMetoda;

import factory.jednoduchaTovarna.Auto;
import factory.jednoduchaTovarna.Kombi;

public class FactoryMethodTest {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactoryImpl();

        Auto kombi = factory.createAuto(Kombi.class);
        Motorka terenni = factory.createMotorka(Terenni.class);

        kombi.displayInfo();
        terenni.displayInfo();
    }
}
