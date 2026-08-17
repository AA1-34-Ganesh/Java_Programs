package com.placement.questions;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        int result=findIndex(arr);
        System.out.print(result);
    }
    static int findIndex(int[] nums) {
        int leftSum=0;
        int rightSum;
        int finalSum=sumOfArr(nums);

        for(int i=0;i<nums.length;i++){
            leftSum+=nums[i];
            rightSum=finalSum-nums[i]-leftSum;

            if(rightSum==leftSum){
                return i;
            }
        }
        return -1;
    }
    static int sumOfArr(int[] nums){
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}
