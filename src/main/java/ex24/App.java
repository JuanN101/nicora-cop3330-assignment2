package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.

Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
 */

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String f = in.nextLine();

        System.out.print("Enter the second string: ");
        String s = in.nextLine();

        if (isAnagram(f, s)) {
            System.out.println("\"" + f + "\"" + " and " + "\"" + s + "\"" + " are anagrams.");
        }
        else {
            System.out.println("\"" + f + "\"" + " and " + "\"" + s + "\"" + " are not anagrams.");
        }
    }

    static boolean isAnagram(String f, String s)
    {
        int s1 = f.length();
        int s2 = s.length();

        if (s1 != s2) {
            return false;
        }

        char[] temp1 = f.toCharArray();
        char[] temp2 = s.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        for (int i = 0; i < s1; i++)
            if (temp1[i] != temp2[i])
                return false;

        return true;
    }
}

