
// Rhombus

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=n-i; j++) {
                    System.out.print("  ");
                }
                for(int k = 1; k<=n; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            sc.close();
        }
    }
}