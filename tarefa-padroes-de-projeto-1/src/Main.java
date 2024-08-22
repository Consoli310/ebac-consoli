public class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = CarFactoryProducer.getFactory("Sedan");
        Car sedan = sedanFactory.createCar();
        sedan.assemble();

        CarFactory suvFactory = CarFactoryProducer.getFactory("SUV");
        Car suv = suvFactory.createCar();
        suv.assemble();
    }
}
