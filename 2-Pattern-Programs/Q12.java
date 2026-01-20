
// Alphabet Triangle

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=i; j++) {
                    System.out.print((char)(i+64) + " ");
                }
                System.out.println();
            }
            
            sc.close();
        }
    }
}