package abstractex;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("desktop display on");
    }

    @Override
    public void typing() {
        System.out.println("desktop typing");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on Desktop");
    }
}
