import java.util.Scanner;

public class CircularQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue s = new CircularQueue(10);
        int d;
        do {
            System.out.println("\n1 Enqueue | 2 Dequeue | 3 Display | 4 Exit");
            System.out.print("Choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1: s.enqueue(sc); break;
                case 2: s.dequeue(); break;
                case 3: s.display(); break;
                case 4: System.out.println("Exit successfully"); break;
                default: System.out.println("Invalid Choice");
            }
        } while (d != 4);
    }
}
