package day01;

public class DataTypeDemo {
    public static void main(String[] args) {
        String a = "hello";
        // String a = new String("hello");
        System.out.println(a.length());
        System.out.println(a.charAt(2));
        a = a.replace("hello", "goodbye");
        System.out.println(a);
        a = a.toUpperCase();
        System.out.println(a);

        // Declare a variable 'blue' of type String and assign the value "blue" to it
        String blue = "blue";

        // Compare the value of the 'blue' variable with the string literal "blue"
        // The '==' operator checks if the references are the same, not the content
        // In this case, the comparison evaluates to true because both refer to the same string value
        boolean withSign = (blue.equals("blue"));

        // Print the value of the 'withSign' variable to the console
        System.out.println(withSign);

        // Using .equals() for content-based comparison
        boolean contentMatch = blue.equals("BLUE");  // Case-sensitive comparison
        System.out.println(contentMatch);

        //Casting

    }
}
