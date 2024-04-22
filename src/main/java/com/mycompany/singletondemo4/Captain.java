package com.mycompany.singletondemo4;

public class Captain {

    private Captain() {
        System.out.println("\tA captain is chosen to your team.");
    }

    public static class SingletonHelper {
        public static final Captain CAPTAIN_INSTANCE = new Captain();
    }
    
    public static Captain getCaptain(){
        return SingletonHelper.CAPTAIN_INSTANCE;
    }
    
    public static void dummyMethod(){
        System.out.println("A dummy method is invoked!");
    }
}
