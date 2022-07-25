package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wipe();

    public void washCar() {}

    public void startCar() {
        System.out.println("start car");
    }
    public void stopCar() {
        System.out.println("stop car");
    }

    public final void run() {
        startCar();
        drive();
        wipe();
        stop();
        washCar();
        stopCar();
    }
}
