package scheduler;

public class PriorityAlgorithm implements Scheduler{
    @Override
    public void getCall() {
        System.out.println("get call from heap order by customer rank");
    }

    @Override
    public void sendCall() {
        System.out.println("give call to best advisor");
    }
}
