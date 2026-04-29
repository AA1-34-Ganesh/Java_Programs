package com.placement.training.inheritance.library;
//1. A Library System has a base class Book and a derived class EBook. Create objects and use
//inheritance to display book details. Ensure 'this' keyword is used to differentiate instance
//variables.
public class Book {
    String bookName;
    String bookAuthor;
    int publicationYear;
    Book(String bookName,String bookAuthor,int publicationYear){
        this.bookName=bookName;
        this.bookAuthor=bookAuthor;
        this.publicationYear=publicationYear;
    }
     void showDetails(){
        System.out.println("Book Name:"+bookName);
        System.out.println("Book Author:"+bookAuthor);
        System.out.println("Published Year:"+publicationYear);
    }
}
