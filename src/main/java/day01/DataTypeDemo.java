package day01;
public class DataTypeDemo {
    public static void main(String[] args) {
        // String demonstration
        String a = "hello";
        System.out.println(a.length());       // Output: 5 (length of the string)
        System.out.println(a.charAt(2));      // Output: 'l' (character at index 2)
        a = a.replace("hello", "goodbye");
        System.out.println(a);                // Output: "goodbye" (replaced string)
        a = a.toUpperCase();
        System.out.println(a);                // Output: "GOODBYE" (uppercase string)

        // Using == for reference-based comparison
        String blue = "blue";
        boolean withSign = (blue.equals("blue"));
        System.out.println(withSign);         // Output: true (references are the same)

        // Using .equals() for content-based comparison
        boolean contentMatch = blue.equals("BLUE");
        System.out.println(contentMatch);     // Output: false (content is case-sensitive)

        // Casting demonstration
        // Implicit casting: Conversion from smaller data types to larger data types happens automatically.
        int al = 100;
        double b = al;                        // int to double
        System.out.println(b);

        // Explicit casting: Conversion from larger data types to smaller data types requires explicit marking.
        double c = 100.7;
        int d = (int) c;                      // double to int
        System.out.println(d);

        // Wrapper classes demonstration
        String strValue = "42";
        int intValue = Integer.valueOf(strValue);
        System.out.println(intValue);         // Converting String to int using Integer.valueOf()

        // Using Integer.parseInt() to convert String to int.
        String anotherStrValue = "42";
        int anotherIntValue = Integer.parseInt(anotherStrValue);
        System.out.println(anotherIntValue);

        // Nan/Null demonstration
        // Using null:
        String noValue = null;                // No specific value assigned
        if (noValue == null) {
            System.out.println("No value present."); // Checking for absence of value
        }

        // Using NaN:
        double undefinedNumber = 0.0 / 0.0;   // Result of undefined operation
        if (Double.isNaN(undefinedNumber)) {
            System.out.println("Not a valid number."); // Checking for undefined numeric result
        }

        // Converting String to double, might result in NaN
        String text = "not_a_number";
        double convertedNumber = Double.parseDouble(text);
        if (Double.isNaN(convertedNumber)) {
            System.out.println("Conversion resulted in not-a-number."); // Checking for conversion to numeric issue

            // NaN ("Not-a-Number") represents undefined numerical results, often from invalid operations.
            // null indicates the absence of a value or uninitialized reference. It's used when a value is unknown or unavailable.
        }
    }
}

