package com.sau.workshop;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class BMIProject2 {
    public static void main(String[] args)throws IOException {
        String username;
        double weight, height ,bmi,height2;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("  BMI Program by.DTI-SAU");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Input you name: ");
        username = reader.readLine();
        //
        System.out.println("Input you weight: ");
        weight = Double.parseDouble(reader.readLine());
        //
        System.out.println("Input you height: ");
        height = Double.parseDouble(reader.readLine());
        //
        System.out.println("++++++++++++++++++++++++++++");
        //
        height2 = height * height;
        bmi = weight/height2;
        //bmi = weight/Math.pow(height, 2);
        System.out.println("BMI of " + username + " is" + String.format(" %.4f", bmi));
        System.out.println("++++++++++++++++++++++++++++");
    }
}
