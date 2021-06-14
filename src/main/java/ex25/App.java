package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String s = in.nextLine();

        if(passwordValidator(s) == 1) {
            System.out.println("The password " + "\''" + s + "\''" + " is a very weak password");
        }
        else if(passwordValidator(s) == 2) {
            System.out.println("The password " + "\''" + s + "\''" + " is a weak password");
        }
        else if(passwordValidator(s) == 3) {
            System.out.println("The password " + "\''" + s + "\''" + " is a strong password");
        }
        else {
            System.out.println("The password " + "\''" + s + "\''" + " is a very strong password");
        }

    }

    static int passwordValidator (String s)
    {
        int l = s.length();
        int n = 0;

        char[] temp1 = s.toCharArray();

        if(l < 8) {
            if (temp1[0] <= 9) {
                n = 1;
            }
            else {
                n = 2;
            }
        }
        else {
            for (int i = 0; i < l; i++) {
                //if(temp1 !=
            }
        }

        return n;
    }
}
