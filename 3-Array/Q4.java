
// Print products of elements of the array

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = createArr();
        
        int product = 1;
        for(int i = 0; i<arr.length; i++) {
            product *= arr[i];
        }
        System.out.println("Product of elements = " + product);
    }

    public static int[] createArr() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int arr[] = new int[size];

            // Taking input
            System.out.println("Enter values of array: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            return arr;
        }
    }
}