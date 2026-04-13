package com.pluralsight;

public class Menu {
    public static void main(String[] args) {
        displaymenu();
        displaymenu();
    }
    public static void displaymenu(){
        System.out.print("=== MENU ===\n" +
                "1. Coffee - $3.99\n" +
                "2. Tea - $2.99\n" +
                "3. Cookie - $1.99\n");
    }
}
