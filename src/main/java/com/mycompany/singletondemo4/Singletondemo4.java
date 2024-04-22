package com.mycompany.singletondemo4;

public class Singletondemo4 {

    public static void main(String[] args) {
        System.out.println("*** A Singleton demo 4 ***");
        Captain.dummyMethod();
        
        Captain instance = Captain.getCaptain();
    }
}
