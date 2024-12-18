package factory.tovarniMetoda;

import factory.jednoduchaTovarna.Auto;

interface VehicleFactory {
    Auto createAuto(Class<? extends Auto> autoClass);
    Motorka createMotorka(Class<? extends Motorka> motorkaClass);
}
