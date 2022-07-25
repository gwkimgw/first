package template;

public class ManualCar extends Car{
    @Override
    public void wipe() {
        System.out.println("manual wiping");
    }

    @Override
    public void drive() {
        System.out.println("manual driving");
    }

    @Override
    public void stop() {
        System.out.println("manual stopping");
    }
}
