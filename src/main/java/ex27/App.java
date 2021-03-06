package ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Juan Nicora
 */

import java.util.Scanner;

/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String first = in.nextLine();

        System.out.print("Enter the last name: ");
        String last = in.nextLine();

        System.out.print("Enter the ZIP code: ");
        int zip = in.nextInt();

        System.out.print("Enter the employee ID: ");
        String employeeID = in.nextLine();
    }

    private void name(String first, String last) {
        int f = first.length();
        int s = last.length();

        if(f == 1) {
            System.out.println("The first name must be at least 2 characters long.");
        }
        else if (f == 0){
            System.out.println("The first name must be filled in.");
        }
        if(s == 1) {
            System.out.println("The last name must be at least 2 characters long.");
        }
        else if(s == 0){
            System.out.println("The last name must be filled in.");
        }
    }

    private void zipcode(int zip) {

    }

}
