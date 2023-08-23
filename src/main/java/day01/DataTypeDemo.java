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
        // Implicit casting: Conversion from smaller data types to larger data types happens automatically.
        int a = 100;
        double b = a; // int to double
        System.out.println(b);

        // Explicit casting: Conversion from larger data types to smaller data types requires explicit marking.
        double c = 100.7;
        int d = (int) c; // double to int
        System.out.println(d);

        // Wrapper classes: Integer is a wrapper around int, providing additional methods.
        String strValue = "42";
        int intValue = Integer.valueOf(strValue);
        System.out.println(intValue); // Converting String to int using Integer.valueOf()
    }
}
