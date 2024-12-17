package factory.tovarniMetoda;

import factory.jednoduchaTovarna.Auto;
import factory.jednoduchaTovarna.AutoFactory;

class VehicleFactoryImpl implements VehicleFactory {
    @Override
    public Auto createAuto(String type) {
        return AutoFactory.createAuto(type);
    }

    @Override
    public Motorka createMotorka(String type) {
        switch (type) {
            case "Cestovní": return new Cestovni();
            case "Terénní": return new Terenni();
            case "Skútr": return new Skutr();
            default: throw new IllegalArgumentException("Neznámý typ motorky");
        }
    }
}
