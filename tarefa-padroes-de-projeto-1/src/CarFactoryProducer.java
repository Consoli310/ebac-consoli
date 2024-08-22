public class CarFactoryProducer {
    public static CarFactory getFactory(String carType) {
        if ("Sedan".equalsIgnoreCase(carType)) {
            return new SedanFactory();
        } else if ("SUV".equalsIgnoreCase(carType)) {
            return new SUVFactory();
        }
        throw new IllegalArgumentException("Unknown car type " + carType);
    }
}
