package com.placement.pattern;

import java.util.Scanner;
//              1
//             2 2
//            3 3 3
//           4 4 4 4
public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();

        for(int row=1;row<=n;row++){
            int spaces=n-row;
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }

            for(int col=0;col<row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
