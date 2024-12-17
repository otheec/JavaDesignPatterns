package factory.abstraktniTovarna;

class SUVComponentsFactory implements VehicleComponentsFactory {
    @Override
    public Motor createMotor() {
        return new BenzinovyMotor();
    }

    @Override
    public PohonKol createPohonKol() {
        return new PredniPohon();
    }
}
