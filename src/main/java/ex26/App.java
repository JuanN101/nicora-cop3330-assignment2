package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Juan Nicora
 */

/*
Exercise 26 - Months to Pay Off a Credit Card
It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring that out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.

Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
Example Output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.

Constraints
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which returns the number of months.
Round fractions of a cent up to the next cent.
 */

import java.util.Scanner;

import static java.lang.Math.log;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your balance? ");
        int balance = in.nextInt();

        System.out.print("What is the APR on the card (as a percent)? ");
        int apr = in.nextInt();

        System.out.print("What is the monthly payment you can make? ");
        int monthly = in.nextInt();

        System.out.println("It will take you " + PaymentCalculator(balance, apr, monthly) + " months to pay off this card.");


    }

    static double PaymentCalculator(int balance, int apr, int monthly) {
        double calculateMonthsUntilPaidOff = -(1/30) * log(1 + balance/monthly * (1 - (1 + apr/365)^30)) / log(1 + apr/365);
        return calculateMonthsUntilPaidOff;
    }
}
