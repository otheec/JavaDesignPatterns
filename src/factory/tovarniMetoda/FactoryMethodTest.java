package factory.tovarniMetoda;

import factory.jednoduchaTovarna.Auto;

public class FactoryMethodTest {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactoryImpl();

        Auto kombi = factory.createAuto("Kombi");
        Motorka terenni = factory.createMotorka("Terénní");

        kombi.displayInfo();
        terenni.displayInfo();
    }
}
