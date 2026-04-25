package com.placement.training.inheritance;

public class MainComplex {
    public static void main(String[] args) {
        Complex_Number num1=new Complex_Number(5,3);
        Complex_Number num2=new Complex_Number(4,4);

        Complex_Number result=num1.sum(num2);
        result.display();
    }
}
