package com.github.perschola;

import java.util.Scanner;

public class InputEvaluator {
    public void run() {
        // prompt user to input name
        // get name input from user

        // evaluate name input from user
            // if name is not "Alice" nor "Bob"
                // display "Stranger danger!" to console
            // if name is "Alice"
                // display "Welcome, Alice!"
            // if name is "Bob"
                // display "Welcome, Bob!"
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob"))
            System.out.println("Hello " + name + '!');
        else
            System.out.println("Stranger danger!");
    }
}
