import java.util.Scanner;

public class TokenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TokenQueue t = new TokenQueue(sc);
        int d;
        do {
            System.out.println("\n1 Enqueue | 2 Dequeue | 3 Display | 4 Size | 5 Empty? | 6 Full? | 7 Exit");
            System.out.print("Choice: ");
            d = sc.nextInt();
            switch (d) {
                case 1: t.enqueue(); break;
                case 2: t.dequeue(); break;
                case 3: t.display(); break;
                case 4: t.size(); break;
                case 5: t.empty(); break;
                case 6: t.full(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid Choice");
            }
        } while (d != 7);
    }
}
