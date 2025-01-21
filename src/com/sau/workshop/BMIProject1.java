package com.sau.workshop;
import java.util.Scanner;


public class BMIProject1 {
    public static void main(String[] args) {
        String username;
        double weight, height ,bmi,height2;

        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("  BMI Program by.DTI-SAU");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Input you name: ");
        username = sc.next();
        //
        System.out.println("Input you weight: ");
        weight = sc.nextDouble();
        //
        System.out.println("Input you height: ");
        height = sc.nextDouble();
        //
        System.out.println("++++++++++++++++++++++++++++");
        height2 = height * height;
        //
        bmi = weight/height2;
        //bmi = weight/Math.pow(height, 2);
        System.out.println("BMI of " + username + " is" + String.format(" %.4f", bmi));
        System.out.println("++++++++++++++++++++++++++++");
    }
}
