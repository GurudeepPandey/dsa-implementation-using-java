
// Alphabet Square 4

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            for(int i = 1; i<=n; i++) {
                for(int j = 1; j<=n; j++) {
                    int value = i % 2 == 0 ? 64 : 96;
                    System.out.print((char)(i+value) + " ");
                }
                System.out.println();
            }
            
            sc.close();
        }
    }
}