
// Star Cross

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            if(n % 2 == 0) {
                System.out.println("Please enter odd numner.");
                n = 0;
            }

            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=n; j++) {
                    if(i==j || j==n+1-i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            
            sc.close();
        }
    }
}