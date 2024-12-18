package factory.jednoduchaTovarna;

public class AutoFactory {
    public static Auto createAuto(Class<? extends Auto> autoClass) {
        try {
            return autoClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Cannot create instance for class: " + autoClass.getName(), e);
        }
    }
}
