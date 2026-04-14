package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
       String formattedName = formatName("bob","smith");
        System.out.println(formattedName);
    }
   public static String formatName(String first, String last){

        return last + "," + first;
    }
}
