package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.println("Hello World");
        System.out.println("Today is April 17, 2019.");
        System.out.println("What is your name?");
        System.out.print("Name: ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");

    }
}
