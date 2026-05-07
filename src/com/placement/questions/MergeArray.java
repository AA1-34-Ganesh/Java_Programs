package com.placement.questions;
public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int size = arr1.length + arr2.length;
        int[] newArray = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            newArray[arr1.length + i] = arr2[i];
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
        //Second Method
//        public class MergeOneLoop {
//            public static void main(String[] args) {
//                int[] arr1 = {1, 2, 3, 4};
//                int[] arr2 = {5, 6, 7, 8};
//
//                int n1 = arr1.length;
//                int n2 = arr2.length;
//                int[] newArray = new int[n1 + n2];
//
//                for (int i = 0; i < n1 + n2; i++) {
//                    if (i < n1) {
//                        newArray[i] = arr1[i];
//                    } else {
//                        newArray[i] = arr2[i - n1];
//                    }
//                }
//
//                for (int num : newArray) {
//                    System.out.print(num + " ");
//                }
//            }
//        }
    }
}