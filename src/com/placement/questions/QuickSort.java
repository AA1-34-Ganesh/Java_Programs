package com.placement.questions;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1,7,8,9,-3,0};
        sort(arr,0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    public static void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];
        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }

        }
        sort(nums,start,mid);
        sort(nums,mid, end);
    }
}
