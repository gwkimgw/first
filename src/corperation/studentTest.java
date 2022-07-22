package corperation;

public class studentTest {
    public static void main(String[] args) {
        Student student1 = new Student("mac", 5000);
        Student student2 = new Student("jim", 10000);

        Bus bus1 = new Bus(100);
        student1.takeBus(bus1);
        student1.showInfo();
        bus1.showInfo();

        Subway subway1 = new Subway(200);
        student2.takeSubway(subway1);
        student2.showInfo();
        subway1.showInfo();
    }
}
