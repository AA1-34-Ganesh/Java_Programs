package com.placement.questions;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] duplicateArray = {1, 2, 2, 3, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < duplicateArray.length; i++) {
            if (!list.contains(duplicateArray[i])) {
                list.add(duplicateArray[i]);
            }
        }

        System.out.println(list);
    }
}
