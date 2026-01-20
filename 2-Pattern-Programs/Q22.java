
// Binary Triangle

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=i; j++) {
                    if((i+j) % 2 == 0) System.out.print(1 + " ");
                    else System.out.print(0 + " ");
                }
                System.out.println();
            }
            
            sc.close();
        }
    }
}