
// Star Square

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. of sides: ");
            int side = sc.nextInt();

            for(int i = 1; i<=side; i++) {
                for(int j = 1; j<=side; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            
            sc.close();
        }
    }
}