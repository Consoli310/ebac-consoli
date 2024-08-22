public class SUVFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new SUVCar();
    }
}