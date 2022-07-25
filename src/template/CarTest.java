package template;

public class CarTest {
    public static void main(String[] args) {
        Car mycar = new ManualCar();
        Car yourcar = new AutoCar();

        mycar.run();
        yourcar.run();
    }
}
