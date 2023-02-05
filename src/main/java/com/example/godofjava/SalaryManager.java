package com.example.godofjava;

public class SalaryManager {
    public static void main(){
        SalaryManager manager = new SalaryManager();
        System.out.println("Real monthlySalary:"+manager.getMonthlySalary(20000000));

    }
    public double getMonthlySalary(int yearSalary){
        double monthlySalary=yearSalary/12.0;
        System.out.println("monthly salary original:"+monthlySalary);

        double tax=calculateTax(monthlySalary);
        double nationalPension=calculateNationalPension(monthlySalary);
        double healthInsurance=calculateHealthInsurance(monthlySalary);
        double minusTotal=tax+nationalPension+healthInsurance;

        System.out.println("Tax per month:"+tax);
        System.out.println("NationalPension per month:"+nationalPension);
        System.out.println("HealthInsurance per month:"+healthInsurance);

        monthlySalary-=minusTotal;

        return monthlySalary;
    }

    public double calculateTax(double monthSalary){
        double Tax =monthSalary*(12.5/100);
        return Tax;
    }

    public double calculateNationalPension(double monthSalary){
        double nationalPension=monthSalary*(8.1/100);
        return nationalPension;
    }
    public double calculateHealthInsurance(double monthlySalary){
        double healthInsurance = monthlySalary*(13.5/100);
        return healthInsurance;
    }




}
