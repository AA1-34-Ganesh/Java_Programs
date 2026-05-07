package com.placement.questions;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 2, 10, 6};
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}