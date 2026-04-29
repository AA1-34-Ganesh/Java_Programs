package com.placement.training.inheritance.library;

public class EBook extends Book{

    String availableFormat;
    int bookSize;
    EBook(String bookName,String bookAuthor,int publicationYear,String availableFormat,int bookSize){
        super(bookName,bookAuthor,publicationYear);
        this.availableFormat=availableFormat;
        this.bookSize=bookSize;
    }
    void bookDetails(){
        System.out.println("Available Format:"+availableFormat);
        System.out.println("Book Size:"+bookSize);
    }
}
