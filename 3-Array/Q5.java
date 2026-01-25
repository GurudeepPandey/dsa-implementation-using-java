
// Search vaule in array

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = createArr();

            int target = 34;

            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (target == arr[i]) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Element not Found.");
            } else {
                System.out.println("Element found at index " + index);
            }

            sc.close();
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