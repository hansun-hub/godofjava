package com.example.godofjava;

public class OperatorCompond {

    public static void main(){
        OperatorCompond sample = new OperatorCompond();
        sample.compund();
    }
    public void compund(){
        int intValue = 10;
        intValue +=5;
        System.out.println(intValue);

        intValue -=5;
        System.out.println(intValue);

        intValue *=5;
        System.out.println(intValue);

        intValue /=5;
        System.out.println(intValue);

        intValue %=5;
        System.out.println(intValue);
    }
}
