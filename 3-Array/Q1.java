
// Input and Output of Array using Loop

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            // Taking input
            System.out.println("Enter values of array: ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            // Print output
            System.out.println("Elements of given array: ");
            for(int i = 0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            sc.close();
        }
    }
}
