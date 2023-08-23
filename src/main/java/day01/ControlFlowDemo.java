package day01;

public class ControlFlowDemo {
    public static void main(String[] args) {
        // Block Statements

        // A block is a group of statements enclosed within curly braces { }.
        // It defines a scope where variables declared inside are accessible only within the block.
        {
            int x = 5; // Variable 'x' is within this block's scope
            System.out.println(x); // Output: 5
        }

        // Variables declared within a block are not accessible outside of it.
        // System.out.println(x); // This would result in a compilation error

        // If Statements

        // 'if' statements are used to conditionally execute code based on the result of a boolean expression.
        boolean expr = true;
        if (expr) {
            // This code block will execute if 'expr' is true.
            System.out.println("Expression is true"); // Output: Expression is true
        } else {
            // This code block will execute if 'expr' is false.
            System.out.println("Expression is false");
        }

        // Ternary Operator

        // The ternary operator is a shorthand way to write simple if-else statements.
        // It evaluates a boolean expression and returns one of two values based on whether the expression is true or false.
        boolean condition = true;
        String result = condition ? "It's true!" : "It's false!";
        System.out.println(result); // Output: It's true!

        // True and False

        // In Java, 'true' and 'false' are boolean literals representing boolean values.
        // They are used in conditions and comparisons to determine the flow of program execution.
        boolean trueValue = true;
        boolean falseValue = false;

        if (trueValue) {
            System.out.println("This will be executed because the condition is true");
        } else {
            System.out.println("This won't be executed");
        }

        if (falseValue) {
            System.out.println("This won't be executed");
        } else {
            System.out.println("This will be executed because the condition is false");
        }

        // Logical AND Operator (&&)

        // The logical AND operator (&&) returns true only if both operands are true.
        // If the left operand is false, the right operand is not evaluated (short-circuiting).
        boolean bothTrue = true && true; // Evaluates to true
        boolean oneFalse = true && false; // Evaluates to false

        System.out.println("Both true: " + bothTrue); // Output: Both true: true
        System.out.println("One false: " + oneFalse); // Output: One false: false

        // Logical OR Operator (||)

        // The logical OR operator (||) returns true if at least one operand is true.
        // If the left operand is true, the right operand is not evaluated (short-circuiting).
        boolean eitherTrue = true || false; // Evaluates to true
        boolean bothFalse = false || false; // Evaluates to false

        System.out.println("Either true: " + eitherTrue); // Output: Either true: true
        System.out.println("Both false: " + bothFalse); // Output: Both false: false

        // Logical NOT Operator (!)

        // The logical NOT operator (!) reverses the boolean value of its operand.
        boolean originalValue = true;
        boolean invertedValue = !originalValue; // Evaluates to false
        System.out.println("Original value: " + originalValue); // Output: Original value: true
        System.out.println("Inverted value: " + invertedValue); // Output: Inverted value: false

        // Comparison Operators

        // Comparison operators are used to compare two values.
        // They return a boolean value (true or false) based on the comparison result.
        int a = 5;
        int b = 10;

        // Less than (<) operator
        boolean lessThanResult = a < b; // Evaluates to true
        System.out.println("Less than: " + lessThanResult); // Output: Less than: true

        // Less than or equal to (<=) operator
        boolean lessThanOrEqualResult = a <= b; // Evaluates to true
        System.out.println("Less than or equal: " + lessThanOrEqualResult); // Output: Less than or equal: true

        // Greater than (>) operator
        boolean greaterThanResult = a > b; // Evaluates to false
        System.out.println("Greater than: " + greaterThanResult); // Output: Greater than: false

        // Greater than or equal to (>=) operator
        boolean greaterThanOrEqualResult = a >= b; // Evaluates to false
        System.out.println("Greater than or equal: " + greaterThanOrEqualResult); // Output: Greater than or equal: false

        // Equality (==) operator
        boolean equalityResult = a == b; // Evaluates to false
        System.out.println("Equality: " + equalityResult); // Output: Equality: false

        // Inequality (!=) operator
        boolean inequalityResult = a != b; // Evaluates to true
        System.out.println("Inequality: " + inequalityResult); // Output: Inequality: true
    }
}




// psvm: Expands to public static void main(String[] args) { }
// This is useful for quickly generating the main method.

// fori: Expands to a for loop template with an index variable.

// iter: Expands to an enhanced for loop template for iterating over collections.

// ifn: Generates an if statement to check for null.

// inn: Generates an if statement to check for not null.

// souf: Generates a System.out.printf() statement.