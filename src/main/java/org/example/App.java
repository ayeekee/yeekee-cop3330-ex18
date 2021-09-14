package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        float temp;
        float result = 0;
        String c = "c";
        String f = "f";

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
        String choice = se.nextLine();

        System.out.println("Your choice: " + choice);

        if(choice.equalsIgnoreCase(c)){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String temperature = se.nextLine();
            temp = Float.parseFloat(temperature);

            result = (temp - 32) * 5 / 9;
        }
        else if(choice.equalsIgnoreCase(f)){
            System.out.print("Please enter the temperature in Celsius: ");
            String temperature = se.nextLine();
            temp = Float.parseFloat(temperature);

            result = (temp * 9 / 5) + 32;
        }

        String msg = (choice.equalsIgnoreCase(c)) ? "The temperature in Celsius is " : "The temperature in Fahrenheit is ";
        System.out.println(msg + " " + result);
    }
}
