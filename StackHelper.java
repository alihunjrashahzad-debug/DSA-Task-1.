import java.util.Scanner;

class StackHelper {
    Scanner sc; int top = -1, n; int[] plates;

    StackHelper(Scanner sc) {
        this.sc = sc;
        System.out.print("Enter stack size: ");
        n = sc.nextInt(); plates = new int[n];
    }
    void push() {
        if (top == n - 1) { System.out.println("Stack Overflow"); return; }
        System.out.print("Enter value: ");
        plates[++top] = sc.nextInt();
        System.out.println("Value pushed");
    }
    void pop() {
        if (top == -1) System.out.println("Stack Underflow");
        else System.out.println("Popped: " + plates[top--]);
    }
    void display() {
        if (top == -1) { System.out.println("Stack is empty"); return; }
        for (int i = top; i >= 0; i--) System.out.println(plates[i]);
    }
    void size() { System.out.println("Size: " + (top + 1)); }
    void empty() { System.out.println(top == -1 ? "Stack is Empty" : "Stack is not Empty"); }
    void full() { System.out.println(top == n - 1 ? "Stack is Full" : "Stack is not Full"); }
}
