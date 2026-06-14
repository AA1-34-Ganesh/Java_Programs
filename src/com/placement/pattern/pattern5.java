
package com.placement.pattern;

public class pattern5 {
        public static void printPattern(int n)
        {
            // Outer loop to handle the upper part
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 2 * n; j++) {

                    // To print spaces
                    if (j > i && j <= 2 * n - i) {
                        System.out.print(" ");
                    }

                    // To print stars
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

            // Outer loop to handle the lower part
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= 2 * n; j++) {

                    // To print spaces
                    if (j > i && j <= 2 * n - i) {
                        System.out.print(" ");
                    }

                    // To print stars
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

        // Driver Function
        public static void main(String[] args)
        {
            // Number of rows
            int n = 2;
            printPattern(n);
        }

}