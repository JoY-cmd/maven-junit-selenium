package com.example;

/**
 * Main application class
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Maven JUnit Selenium Project");
        System.out.println("Run tests with: mvn test");
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
