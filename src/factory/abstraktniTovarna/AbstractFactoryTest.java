package factory.abstraktniTovarna;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        VehicleComponentsFactory suvFactory = new SUVComponentsFactory();
        VehicleComponentsFactory kombiFactory = new KombiComponentsFactory();

        Motor suvMotor = suvFactory.createMotor();
        PohonKol suvPohon = suvFactory.createPohonKol();

        Motor kombiMotor = kombiFactory.createMotor();
        PohonKol kombiPohon = kombiFactory.createPohonKol();

        System.out.println("SUV - Motor: " + suvMotor.getDescription() + ", Pohon: " + suvPohon.getDescription());
        System.out.println("Kombi - Motor: " + kombiMotor.getDescription() + ", Pohon: " + kombiPohon.getDescription());
    }
}
