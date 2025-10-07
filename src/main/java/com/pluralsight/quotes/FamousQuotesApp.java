package com.pluralsight.quotes;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FamousQuotesApp {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");


        String[] quotes = {
                "The only thing we have to fear is fear itself. - Franklin D. Roosevelt",
                "In the middle of difficulty lies opportunity. - Albert Einstein",
                "That's one small step for man, one giant leap for mankind. - Neil Armstrong",
                "The unexamined life is not worth living. - Socrates",
                "Give me liberty, or give me death! - Patrick Henry",
                "An eye for an eye only ends up making the whole world blind. - Mahatma Gandhi",
                "Ask not what your country can do for you – ask what you can do for your country. - John F. Kennedy",
                "The journey of a thousand miles begins with one step. - Lao Tzu",
                "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill",
                "Knowledge is power. - Francis Bacon"
        };

        // Ask the user for a number between 1 and 10
        System.out.print("Please enter a number between 1 and 10, inclusive: ");

        Scanner scanner = new Scanner(System.in);

        // Read the number
        int inputNumber = scanner.nextInt();
        scanner.nextLine();

        // Test input and validate
        if (inputNumber <1 || inputNumber >10){
            System.out.println("""
                    Ooops!  That number I can't deal with.
                        I only do numbers between 1 and 10
                        Please try again.""");
            System.exit(1);
        }
        // Subtract one from user input, and use as an index into the array
        inputNumber--;

        // Example: print a quote

        System.out.println("Thank you for your number!  Here is a famous quote:");
        System.out.println(quotes[inputNumber]);


        scanner.close();
    }
}