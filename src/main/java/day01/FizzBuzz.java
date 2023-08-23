package day01;
public class FizzBuzz {
    public static void main(String[] args) {
        // 1. The `++` Operator:
        // Increment operator increases the value of a variable by 1.
        // Rules for Fizz Buzz: divisible by 3 (Fizz), by 5 (Buzz), both (FizzBuzz).
        // Use modulo operator and conditions to solve within a loop.
        // Iterate through numbers 1 to 101 using a for loop

        for (int i = 1; i <= 101; i++) {
            // Loop setup:
            // - for loop iterates over values from 1 to 101.
            // - int i = 1 initializes the loop variable i to 1.
            // - i <= 101 is the termination condition; loop continues as long as i <= 101.
            // - i++ increments i by 1 after each iteration.

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);

                // Divisibility Checks:
                // - i % 3 == 0 && i % 5 == 0 checks if number is divisible by both 3 and 5, printing "FizzBuzz".
                // - i % 3 == 0 checks if number is divisible by 3, printing "Fizz".
                // - i % 5 == 0 checks if number is divisible by 5, printing "Buzz".
                // - If none of the above conditions are met, the number itself is printed.
            }
        }
    }
}
