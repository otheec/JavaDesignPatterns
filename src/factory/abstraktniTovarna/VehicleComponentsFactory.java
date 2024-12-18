package factory.abstraktniTovarna;

interface VehicleComponentsFactory extends Motor, PohonKol {
    Motor createMotor();
    PohonKol createPohonKol();
}
