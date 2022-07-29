package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if(len == 0) {
            return null;
        }
        return arrayQueue.remove(0);
    }

    public String peek() {
        return arrayQueue.get(0);
    }
}

public class QueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");

        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
