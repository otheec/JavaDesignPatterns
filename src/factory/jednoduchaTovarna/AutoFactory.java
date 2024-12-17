package factory.jednoduchaTovarna;

public class AutoFactory {
    public static Auto createAuto(String type) {
        switch (type) {
            case "SUV": return new SUV();
            case "Kombi": return new Kombi();
            case "Sedan": return new Sedan();
            case "Mini": return new Mini();
            default: throw new IllegalArgumentException("Neznámý typ auta");
        }
    }
}
