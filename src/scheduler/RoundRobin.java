package scheduler;

public class RoundRobin implements Scheduler{
    @Override
    public void getCall() {
        System.out.println("get call from heap");
    }

    @Override
    public void sendCall() {
        System.out.println("give to advisor");
    }
}
