public class Switch {
    public static void main(String[] args) {
        // Using a switch statement to evaluate multiple cases based on a value
        String food = "apple";

        switch (food) {
            case "pear":
                System.out.println("I like pears");
                break;
            case "apple":
                System.out.println("I like apples");
                break;
            default:
                System.out.println("No favorite");
        }
        // Output: I like apples

        // Note about the importance of break statements
        // If you omit break statements, the code will continue to evaluate subsequent cases
        String food2 = "apple";

        switch (food2) {
            case "pear":
                System.out.println("I like pears");
            case "apple":
                System.out.println("I like apples");
            default:
                System.out.println("No favorite");
        }
        // Output: I like apples No favorite
    }
}
