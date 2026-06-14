package com.placement.pattern;
import java.util.Scanner;


//1
//2 3
//4 5 6
//7 8 9 10
public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n=scanner.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
