// Java Program to Increment by 1 All the Digits of a given 
// Integer 

// Importing Libraries 
import java.util.*;
import java.io.*;

class add1 {
    // Main function
    public static void main(String[] args) {
        // Declaring the number
        int number = 110102;
        // Declaring another variable with value 1
        int add = 1;

        for (int i = 0; i < String.valueOf(number).length(); i++) {
            // Adding variable add and number
            number = number + add;

            // Multiplying value of the add with 10
            add = add * 10;
        }
        // Printing result
        System.out.println(number);
    }
}
