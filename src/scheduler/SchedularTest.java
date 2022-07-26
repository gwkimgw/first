package scheduler;

import java.io.IOException;

public class SchedularTest {
    public static void main(String[] args) throws IOException {
        System.out.println("choose R, L, P");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R') {
            scheduler = new RoundRobin();
        }
        else if (ch == 'L') {
            scheduler = new LeastJob();
        }
        else if (ch == 'P') {
            scheduler = new PriorityAlgorithm();
        } else {
            System.out.println("error!");
            return;
        }

        scheduler.getCall();
        scheduler.sendCall();
    }
}
