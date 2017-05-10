package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a function that can accept a number
    // between 1-100
    // If the value is evenly divisible by 3,
    // return "Fizz"
    // If the value is evenly divisible by 5,
    // return "Buzz"
    // If the value is evenly divisible by both 3 and 5,
    // return "FizzBuzz"
    // Otherwise, return the number

        Scanner scanner = new Scanner(System.in);
        // Make a new Value object.
        Value v = new Value();
        // Ask the user for a number between 1 and 100.
        System.out.println("Please enter a number between 1 and 100");
        // set "selection" equal to the Integer value of scanner.netLine
        int theIntOfInitialValue = Integer.valueOf(scanner.nextLine());
        // set the scanner equal to the initialValue
        scanner.equals(v.initialValue);

        // now set the initialValue = to the "selection"
        v.initialValue = theIntOfInitialValue;

        // set the boolean "value2" = to the v.initialValue mod 3 > 0
        boolean valueOf3 = (v.initialValue % 3) == 0;
        // System.out.println(valueOf3);
        // if (valueOf3 == false);

        boolean valueOf5 = (v.initialValue % 5) == 0;
        // System.out.println(valueOf5);
        // if (valueOf5 == false)

        // if (valueOf3 == true && valueOf5 == true) {
        //     System.out.println("FizzBuzz");
        // }
        if (valueOf3 == false && valueOf5 == false) {
            System.out.println(v.initialValue);
        } else {
            if (valueOf3 == false) {
            } else {
                System.out.print("Fizz");
            }
            if (valueOf5 == false) {
            } else {
                System.out.println("Buzz");
            }
        }
    }
}
