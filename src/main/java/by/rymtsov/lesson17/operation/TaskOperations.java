package main.java.by.rymtsov.lesson17.operation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * This is a class with static methods to:
 * find factorial of the number,
 * get day of the week from date.
 */

public class TaskOperations {

    public static long findFactorial(long number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void getDayOfWeekFromDate(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(date, formatter);
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            System.out.println("The date " + date + " is " + dayOfWeek.toString().toLowerCase());
        }
        catch (DateTimeParseException e) {
            System.out.println("Error: wrong date format.");
        }
    }
}
