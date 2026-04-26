package com.placement.protecte;

public class ProtectedExample {
    public static void main(String[] args) {

        LoginClass obj = new LoginClass("Joe");

        obj.setDetails(1234);
        obj.display();
    }
}