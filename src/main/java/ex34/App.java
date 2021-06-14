package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names. Print out the list of names when the program runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
Use an array or list to store the names.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        System.out.println("There are 5 employees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.print("Enter an employee name to remove: ");
        String remove = in.nextLine();

        if(remove.equals("John Smith")) {
            for (int i = 0; i < employees.length; i++) {
                if (i != 0) {
                    System.out.println(employees[i]);
                }
            }
        }
        else if(remove.equals("Jackie Jackson")) {
            for (int i = 0; i < employees.length; i++) {
                if (i != 1) {
                    System.out.println(employees[i]);
                }
            }
        }
        else if(remove.equals("Chris Jones")) {
            for (int i = 0; i < employees.length; i++) {
                if (i != 2) {
                    System.out.println(employees[i]);
                }
            }
        }
        else if(remove.equals("Amanda Cullen")) {
            for (int i = 0; i < employees.length; i++) {
                if (i != 3) {
                    System.out.println(employees[i]);
                }
            }
        }
        else {
            for (int i = 0; i < employees.length - 1; i++) {
                System.out.println(employees[i]);
            }
        }

    }


}
