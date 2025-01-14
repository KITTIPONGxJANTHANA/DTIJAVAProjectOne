package com.sau.tech;

import java.util.Scanner;
//import  java.lang.String;

public class MyClass03 {
    public static void main(String[] args) {
        String empName;
        double empSalary, tax10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input employee name: ");
        empName = sc.next();
        //
        System.out.println("Input employee salary: ");
        empSalary = sc.nextDouble();
        //
        System.out.println("--------------------");

        tax10 = empSalary * 10 / 100;
        System.out.println("You name: " + empName);
        System.out.println("You name: " + empSalary);
        System.out.println("TAX pay: " + tax10 + "Baht");


    }
}
