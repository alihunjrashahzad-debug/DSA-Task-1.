import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackHelper s = new StackHelper(sc);
        int d;
        do {
            System.out.println("\n1 Push | 2 Pop | 3 Display | 4 Size | 5 Empty? | 6 Full? | 7 Exit");
            System.out.print("Choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1: s.push(); break;
                case 2: s.pop(); break;
                case 3: s.display(); break;
                case 4: s.size(); break;
                case 5: s.empty(); break;
                case 6: s.full(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Choice");
            }
        } while (d != 7);
    }
}
