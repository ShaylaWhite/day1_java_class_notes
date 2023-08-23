package day01;

public class Loops {
    public static void main(String[] args) {
        // While Loop
        // The while loop continues to execute a block of code while a condition is true.
        // Be cautious of infinite loops!
        // while (true) {
        //     // This is an infinite loop!
        // }

        // Do-While Loop
        // The do-while loop executes the code block at least once before checking the condition.
        int input = 0;
        do {
            System.out.println(input++);
        } while (input < 10);

        // For Loop
        // The for loop is used for iterating over a range of values.
        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            System.out.println(i);
        }
    }
}