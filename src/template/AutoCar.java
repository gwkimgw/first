package template;

public class AutoCar extends Car{
    @Override
    public void wipe() {
        System.out.println("auto wiping");
    }

    @Override
    public void drive() {
        System.out.println("automatic driving");
    }

    @Override
    public void stop() {
        System.out.println("automatic stopping");
    }

    @Override
    public void washCar() {
        System.out.println("automatic washing");
    }
}
