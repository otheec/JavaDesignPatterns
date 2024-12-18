package factory.tovarniMetoda;

import factory.jednoduchaTovarna.Auto;
import factory.jednoduchaTovarna.AutoFactory;

class VehicleFactoryImpl implements VehicleFactory {
    @Override
    public Auto createAuto(Class<? extends Auto> autoClass) {
        return AutoFactory.createAuto(autoClass);
    }

    @Override
    public Motorka createMotorka(Class<? extends Motorka> motorkaClass) {
        try {
            return motorkaClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot create instance for class: " + motorkaClass.getName(), e);
        }
    }
}
