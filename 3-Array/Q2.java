
// Given an array, print negative elements only

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = createArr();
        
        System.out.println("Negative elements are: ");
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }
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