package com.placement.privat;

public class PrivateExample {
    public static void main(String[] args) {
        PersonDetails details = new PersonDetails(12345678923145L, "John", 8907483523L, "New york, USA");
//        details.aadharNo; because it is in private we cannot access outside the class , to access use the get method
        long aadharNo=details.getAadharNo();
        details.display();

    }
}
