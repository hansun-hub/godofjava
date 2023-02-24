package com.example.godofjava;

public class InterestManager {
    public void main(String args[]){

        double interest;
        InterestManager interestManager = new InterestManager();

        for(int day=1 ;day<366;day++) {
            interest=interestManager.calculateAmount(day,1000000);
            System.out.println(day+"날에 받을 수 있는 이자 : "+ interest);
        }

        for(int i=10 ;i<=370;i=i+10) {
            double amount=interestManager.calculateAmount(i,1000000);
            System.out.println(i+"날에 받을 수 있는 이자 : " + amount);
        }
    }

    public double getInterestRate(int day){
        double interest = 0;
        if(day<=90){
            interest=0.5;
        }else if(day<=180){
            interest=1;
        }else if(day<=364){
            interest=2;
        }else{
            interest=5.6;
        }
        return interest;
    }

    public double calculateAmount(int day, long amount){
        double interest = 0;
        interest = getInterestRate(day);
        double account = amount + (amount*interest/100.0);
        return account;

    }




}
