import java.util.Scanner;

public class LinkedStackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedStack s = new LinkedStack();
        int d;
        do {
            System.out.println("\n1 Push | 2 Pop | 3 Display | 4 Exit");
            System.out.print("Choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1: s.push(sc); break;
                case 2: s.pop(); break;
                case 3: s.display(); break;
                case 4: System.out.println("Exit successfully"); break;
                default: System.out.println("Invalid Choice");
            }
        } while (d != 4);
    }
}
