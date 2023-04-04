package p2;

public class MyLinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queueTest = new MyLinkedListQueue();
        queueTest.enQueue(1);
        queueTest.enQueue(2);
        queueTest.enQueue(3);
        queueTest.enQueue(4);
        System.out.println("My queueTest after enqueue: " + queueTest);
        Node temp = queueTest.deQueue();
        System.out.println("My queueTest after dequeue: " + queueTest);
        System.out.println("The node that out queue is: " + temp);
        Node temp2 = queueTest.deQueue();
        System.out.println("My queueTest after dequeue: " + queueTest);
        System.out.println("The node that out queue is: " + temp2);
    }
}
