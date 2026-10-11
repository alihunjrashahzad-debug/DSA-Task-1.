import java.util.Scanner;

class LinkedStack {
    static class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }
    Node top;

    void push(Scanner sc) {
        System.out.print("Enter data: ");
        Node n = new Node(sc.nextInt());
        n.next = top;
        top = n;
        System.out.println("Pushed");
    }
    void pop() {
        if (top == null) { System.out.println("Stack is empty"); return; }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }
    void display() {
        if (top == null) { System.out.println("Stack is empty"); return; }
        for (Node t = top; t != null; t = t.next) System.out.println(t.data);
    }
}
