package com.placement.questions;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {6, 7, 3, 5, 8};
        ArrayList<Integer> commonList = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    if (!commonList.contains(array1[i])) {
                        commonList.add(array1[i]);
                    }
                }
            }
        }

        System.out.println(commonList);
    }
}
