package com.placement.pattern;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();

        for(int row=0;row<2*n;row++){
            int totalColsInrow=row>n?2*n-row:row;
            int spaces=n-totalColsInrow;

            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalColsInrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
