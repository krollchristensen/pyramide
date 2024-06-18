import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast antal linjer: ");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++) {
            // Udskriv mellemrum
            for (int j = lines; j > i; j--) {
                System.out.print("  ");
            }
            // Udskriv tal nedadgående
            for (int j = i; j > 1; j--) {
                System.out.print(j + " ");
            }
            // Udskriv tal opadgående
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
