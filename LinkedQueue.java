import java.util.Scanner;

class LinkedQueue {
    static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }
    Node f, r;

    void enqueue(Scanner sc) {
        System.out.print("Enter data: ");
        Node n = new Node(sc.nextInt());
        if (f == null) f = r = n; else { r.next = n; r = n; }
        System.out.println("Inserted");
    }
    void dequeue() {
        if (f == null) { System.out.println("Underflow"); return; }
        System.out.println("Deleted: " + f.data);
        f = f.next;
        if (f == null) r = null;
    }
    void display() {
        if (f == null) { System.out.println("Queue is empty"); return; }
        for (Node t = f; t != null; t = t.next) System.out.println(t.data);
    }
}
