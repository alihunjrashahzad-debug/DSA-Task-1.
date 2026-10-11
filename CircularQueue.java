import java.util.Scanner;

class CircularQueue {
    int f = -1, r = -1, n; int[] q;

    CircularQueue(int n) { this.n = n; q = new int[n]; }
    boolean isEmpty() { return f == -1; }
    boolean isFull() { return (r + 1) % n == f; }

    void enqueue(Scanner sc) {
        if (isFull()) { System.out.println("Overflow"); return; }
        System.out.print("Enter data: ");
        int v = sc.nextInt();
        if (isEmpty()) f = r = 0; else r = (r + 1) % n;
        q[r] = v;
        System.out.println("Inserted");
    }
    void dequeue() {
        if (isEmpty()) { System.out.println("Underflow"); return; }
        System.out.println("Deleted: " + q[f]);
        if (f == r) f = r = -1; else f = (f + 1) % n;
    }
    void display() {
        if (isEmpty()) { System.out.println("Queue is empty"); return; }
        for (int i = f; i != r; i = (i + 1) % n) System.out.println(q[i]);
        System.out.println(q[r]);
    }
}
