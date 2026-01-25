
// Multiply odd indexed elements by 2 and add 10 to even indexed elements.

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = createArr();

        for(int i = 0; i<arr.length; i++) {
            if(i % 2 == 0) System.out.print(arr[i] + 10 + " ");
            else System.out.print(arr[i] * 2 + " ");
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