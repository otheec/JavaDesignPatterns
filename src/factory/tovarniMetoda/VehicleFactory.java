package factory.tovarniMetoda;

import factory.jednoduchaTovarna.Auto;

interface VehicleFactory {
    Auto createAuto(String type);
    Motorka createMotorka(String type);
}
