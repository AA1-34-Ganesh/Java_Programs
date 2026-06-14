package com.placement.pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=scanner.nextInt();

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row==0 || row==n-1 || col==0 || col==n-1){
                   System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
