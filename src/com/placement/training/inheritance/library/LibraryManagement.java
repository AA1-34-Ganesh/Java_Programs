package com.placement.training.inheritance.library;

public class LibraryManagement {
    public static void main(String[] args) {
        EBook newBook=new EBook("Programming in java", "E Balaguruswamy", 2018, "PDF,Word", 1049);
        newBook.showDetails();
        newBook.bookDetails();
    }
}
