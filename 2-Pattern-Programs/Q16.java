
// Alphabet Triangle Horizontally Flipped

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of n: ");
            int n = sc.nextInt();

            for(int i = n; i>=1; i--) {
                for(int j = 1; j<=i; j++) {
                    System.out.print((char)(j+96) + " ");
                }
                System.out.println();
            }
            
            sc.close();
        }
    }
}