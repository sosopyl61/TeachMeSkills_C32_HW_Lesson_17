package main.java.by.rymtsov.lesson17;

import main.java.by.rymtsov.lesson17.func.MyFunc;
import main.java.by.rymtsov.lesson17.operation.TaskOperations;

import java.util.Scanner;

/**
 * This is the application runner class.
 * Task 1:
 * Create a generalized functional interface. Write a class with one method. In this method, implement the logic:
 * if the number 1 is entered into the console, then: use the interface with a string type and pass the logic of reversing the string (outputting the string in reverse order) to the interface method.
 * if the number 2 is entered into the console, then: use the interface with an integer type and pass the logic of finding the factorial of the number to the interface method.
 * Task 2:
 * Get the day of the week by date.
 */

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter 1 or 2: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                MyFunc<String> reverseString = str -> new StringBuilder(str).reverse().toString();
                System.out.print("Please, enter a string: ");
                String input = sc.next();
                System.out.println("Your reversed string: " + reverseString.doAction(input));
                break;
            case 2:
                MyFunc<Long> factorial = TaskOperations::findFactorial;
                System.out.print("Please, enter a number: ");
                long number = sc.nextInt();
                try {
                    if (number < 0)
                        throw new IllegalArgumentException("You can't find factorial of a number that is less than 0!");
                    System.out.println("Your factorial of " + number + " is " + factorial.doAction(number));
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid input.");
        }

        System.out.print("Please, enter a date in format YYYY-MM-DD: ");
        String date = sc.next();
        TaskOperations.getDayOfWeekFromDate(date);
        sc.close();
    }
}
