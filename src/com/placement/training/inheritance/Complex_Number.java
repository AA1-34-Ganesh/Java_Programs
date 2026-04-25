package com.placement.training.inheritance;

public class Complex_Number {
    int real;
    int img;

    Complex_Number(){
          System.out.println("Default Construtor Called.");
    }
    Complex_Number(int r,int i){
        real=r;
        img=i;
    }
    Complex_Number(Complex_Number soure){
        real= soure.real;
        img= soure.img;
    }

   public Complex_Number sum(Complex_Number other){
        return new Complex_Number(this.real+ other.real,this.img+other.img);
    }
    void display(){
        System.out.println(this.real+"+"+this.img+"i");
    }
}
