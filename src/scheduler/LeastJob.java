package scheduler;

public class LeastJob implements Scheduler{
    @Override
    public void getCall() {
        System.out.println("get call from heap");
    }

    @Override
    public void sendCall() {
        System.out.println("give call to advisor with least job");
    }
}
