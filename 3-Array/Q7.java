
// Print the minimum element in the array.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = createArr();

        int minValue = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(minValue > arr[i]) minValue = arr[i];
        }
        System.out.println("Minimum element in array: " + minValue);
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