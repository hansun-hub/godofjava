package com.example.godofjava;

public class ControlIf {
    public static void main(String args[]){

        ControlIf control = new ControlIf();
    }

    public void ifStatement(){
        if(true);
        if(true) System.out.println("It's true");
        if(true)
            System.out.println("It's also true.");
        if(false) System.out.println("it's false");
    }

    public void ifElseStatement(){
        int intValue=10;

        if(intValue > 5) System.out.println("It's bigger than 5");
        else System.out.println("I");
    }
}
