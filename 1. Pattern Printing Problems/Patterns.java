
// All patterns problems

public class Patterns {
    public static void main(String[] args) {

        // 1. Solid Rectangle
        // for(int i = 0; i<5; i++) {
        //     System.out.println("* * * * *");
        // }


        // 1. Solid Rectangle
        // for(int i = 0; i<5; i++) {
        //     for(int j = 0; j<5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }


        // 2. Hollow rectangle
        // for(int i = 1; i<6; i++) {
        //     for(int j = 1; j<6; j++) {
        //         if(i == 1 || i == 5 || j == 1 || j == 5) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // 3. Half Pyramid
        // for(int i = 1; i<6; i++) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // 4. Inverted Half Pyramid
        // for(int i = 5; i>=1; i--) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // 5. Inverted Half Pyramid (rotated by 180deg)
        // for(int i = 1; i<=5; i++) {
        //     for(int j = 1; j<=5-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 6. Half Pyramid with Numbers
        // for(int i = 1; i<=5; i++) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // 7. Inverted Half Pyramid with Numbers
        // for(int i = 5; i>=1; i--) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // 8. Floyd's Triangle
        // int count = 1;
        // for(int i = 1; i<=5; i++) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print(count + " ");
        //         count++;
        //     }
        //     System.out.println();
        // }


        // 9. 0-1 Triangle
        // for(int i = 1; i<=5; i++) {
        //     for(int j = 1; j<=i; j++) {
        //         int sum = i + j;
        //         if(sum % 2 == 0) {
        //             System.out.print("1 ");
        //         } else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }


        // 10. Butterfly Pattern
        // int n = 2;
        // for(int i = 1; i<=n; i++) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     for(int j = 1; j<=(n-i)*2; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i = n; i>=1; i--) {
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     for(int j = 1; j<=(n-i)*2; j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // 11. Solid Rhombus
        // int n = 5;
        // for(int i = 1; i<=n; i++) {
        //     for(int j = 1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 12. Number Pyramid
        // int n = 5;
        // for(int i = 1; i<=n; i++) {
        //     for(int j = 1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }


        // 13. Pailndromic Pattern
        // int n = 5;
        // for(int i = 1; i<=n; i++) {
        //     for(int j = 1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k = i; k>=1; k--) {
        //         System.out.print(k);
        //     }
        //     for(int l = 2; l<=i; l++) {
        //         System.out.print(l);
        //     }
        //     System.out.println();
        // }


        // 14. Diamond Pattern
        int n = 4;
        int m = 1;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=m; k++) {
                System.out.print("*");
            }
            System.out.println();
            m = m + 2;
        }
        m = n * 2 - 1;
        for(int i = n; i>=1; i--) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=m; k++) {
                System.out.print("*");
            }
            System.out.println();
            m = m - 2;
        }
    }
}