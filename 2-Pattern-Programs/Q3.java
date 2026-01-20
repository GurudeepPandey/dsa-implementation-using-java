
// Number Square

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            
            sc.close();
        }
    }
}