package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        // Calls Methods outside Main
        sayHello();
        sayGoodbye();
        sayGoodMorning();

    }
    // prints "Hello World!" Method
    public static void sayHello(){
        System.out.println("Hello World!");
    }
    // prints "Goodbye!" Method
    public static void sayGoodbye(){
        System.out.println("Goodbye!");
    }
    // prints "Good Morning!" Method
    public static void sayGoodMorning(){
        System.out.println("Good Morning!");
    }
}
