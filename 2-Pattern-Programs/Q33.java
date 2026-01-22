
// Number Spiral

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            // Approach 1:
            // int cols = n*2-1;
            // for(int i = 1; i<=n; i++) {
            //     for(int j = 1; j<=cols; j++) {
            //         if(j<=i) System.out.print(j + " ");
            //         else if(j<=cols-i+1) System.out.print(i + " ");
            //         else System.out.print(cols-j+1 + " ");
            //     }
            //     System.out.println();
            // }
            // for(int i = n-1; i>=1; i--) {
            //     for(int j = 1; j<=cols; j++) {
            //         if(j>=i & j<=(cols-i)+1) System.out.print(i + " ");
            //         else if(j<i) System.out.print(j + " ");
            //         else System.out.print(cols-j+1 + " ");
            //     }
            //     System.out.println();
            // }

            // Approach 2:
            for(int i = 1; i<=2*n-1; i++) {
                for(int j = 1; j<=2*n-1; j++) {
                    int a = i, b = j;
                    if(i>n) a = 2*n - i;
                    if(j>n) b = 2*n - j;
                    System.out.print(Math.min(a, b) + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }
}