package factory.abstraktniTovarna;

class KombiComponentsFactory implements VehicleComponentsFactory {
    @Override
    public Motor createMotor() {
        return new NaftovyMotor();
    }

    @Override
    public PohonKol createPohonKol() {
        return new ZadniPohon();
    }
}
