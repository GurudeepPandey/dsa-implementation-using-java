
// Star Rectangle

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter no. of rows: ");
            int rows = sc.nextInt();

            System.out.println("Enter no. of columns: ");
            int cols = sc.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            sc.close();
        }
    }
}
