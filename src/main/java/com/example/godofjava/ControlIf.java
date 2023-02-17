package com.example.godofjava;

public class ControlIf {
    public static void main(String args[]){

        ControlIf control = new ControlIf();
//        control.ifStatement();
        control.ifElseStatement();
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
        else System.out.println("It's smaller or equal than 5.");

        if(intValue <= 5)
            System.out.println("It's smaller or equal than 5.");
        else System.out.println("It's bigger than 5");
    }

    public class ControlIfAndOr{
        public void main(String args[]){
            ControlIfAndOr control = new ControlIfAndOr();
            control.ifAndOr();
        }

        public void ifAndOr(){
            int age = 25;
            boolean isMarried = true;

            if(age>25 && isMarried){
                System.out.println("Age is over 25 and Married");
            }
            if(age>25 || isMarried){
                System.out.println("Age is over 25 or Married");
            }
        }
    }
}
