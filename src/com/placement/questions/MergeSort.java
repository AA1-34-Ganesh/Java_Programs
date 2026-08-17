package com.placement.questions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};

        mergeSort(arr);
    }

    static int[] mergeSort(int[] arr){
        int mid=arr.length/2;
        int start=0;
        int end=arr.length;
        int[] left= mergeSort(Arrays.copyOfRange(arr,start,mid));
        int[]  right=mergeSort(Arrays.copyOfRange(arr,mid,end));

        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second){
       int[] mix=new int[first.length+second.length];

       return mix;
    }
}
