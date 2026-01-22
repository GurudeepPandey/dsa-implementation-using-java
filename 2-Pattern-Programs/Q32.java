
// Hollow Diamond

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            for(int i = 1; i<=n*2-1; i++) {
                System.out.print("* ");
            }
            System.out.println();
            for(int i = 1; i<=n-1; i++) {
                for(int j = 1; j<=n-i; j++) {
                    System.out.print("* ");
                }
                for(int k = 1; k<=i*2-1; k++) {
                    System.out.print("  ");
                }
                for(int l = 1; l<=n-i; l++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i = 1; i<=n-1; i++) {
                for(int j = 1; j<=i; j++) {
                    System.out.print("* ");
                }
                for(int k = 1; k<=(n-1-i)*2+1; k++) {
                    System.out.print("  ");
                }
                for(int l = 1; l<=i; l++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i = 1; i<=n*2-1; i++) {
                System.out.print("* ");
            }

            sc.close();
        }
    }
}