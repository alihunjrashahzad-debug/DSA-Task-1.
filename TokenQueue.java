import java.util.Scanner;

class TokenQueue {
    Scanner sc; int front = -1, rear = -1, n; int[] q;

    TokenQueue(Scanner sc) {
        this.sc = sc;
        System.out.print("Enter queue size: ");
        n = sc.nextInt(); q = new int[n];
    }
    boolean isEmpty() { return front == -1 || front > rear; }
    boolean isFull() { return rear == n - 1; }

    void enqueue() {
        if (isFull()) { System.out.println("Queue is Full"); return; }
        System.out.print("Enter token: ");
        int v = sc.nextInt();
        if (front == -1) front = 0;
        q[++rear] = v;
        System.out.println("Inserted");
    }
    void dequeue() {
        if (isEmpty()) System.out.println("Queue is Empty");
        else System.out.println("Deleted: " + q[front++]);
    }
    void display() {
        if (isEmpty()) { System.out.println("Queue is Empty"); return; }
        for (int i = front; i <= rear; i++) System.out.println(q[i]);
    }
    void size() { System.out.println("Size: " + (isEmpty() ? 0 : rear - front + 1)); }
    void empty() { System.out.println(isEmpty() ? "Queue is Empty" : "Queue is not Empty"); }
    void full() { System.out.println(isFull() ? "Queue is Full" : "Queue is not Full"); }
}
