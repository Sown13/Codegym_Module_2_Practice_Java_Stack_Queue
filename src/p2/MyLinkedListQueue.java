package p2;

import java.util.ArrayList;

public class MyLinkedListQueue {
    public Node head = null;
    public Node tail = null;

    public MyLinkedListQueue() {
    }

    public void enQueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node deQueue() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return temp;
    }

    @Override
    public String toString() {
        return "MyLinkedListQueue{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
