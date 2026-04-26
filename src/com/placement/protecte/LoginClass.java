package com.placement.protecte;

import com.placement.protected2.ProtectExample;

public class LoginClass extends ProtectExample {

    LoginClass(String name) {
        super(name);
    }

    void setDetails(int pass) {
        password = pass;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
    }
}