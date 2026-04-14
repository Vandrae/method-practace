package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // user input
        System.out.print("Enter a number: ");
        double num = input.nextInt();
        System.out.println("----------------------");
        //calls the method isEven and uses num variable with that method
        System.out.println(num + " Is even: \n" + isEven(num));
        System.out.println("----------------------");
        System.out.println(num + " Is positive: \n" + isPos(num));
        System.out.println("----------------------");

    }
    //isEven method
   public static boolean isEven(double num) {
       //is divisible by 2 and 0 remainders i.e is even?
       if (num % 2 == 0) {
           return true;
       } else {
           return false;
       }
   }
    //is positive method
    public static boolean isPos(double num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }
}
