package day01;

public class VariableDemo {                  //class name must be capitialzed
    public static void main(String[] args) {
        //Primatives
        byte myByte = 127;
        short myShort = 30000;
        int myInt = 150000;
        long myLong = 123456789012345L;      // Note the 'L' at the end for long literals
        float myFloat = 3.14f;               // Note the 'f' at the end for float literals
        double myDouble = 2.71828;
        char myChar = 'A';                    //single quotes ie: '7', '$'
        boolean myBoolean = true;
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        System.out.println(Math.pow(3,2));    // Java provides a special Math object with some useful methods.

        //Objects attached to a class
        String name = "Shay Goddess";
        System.out.println(name);
    }
}
// Classes and objects should start with a capital letter (e.g., String, Integer)
// Primitives always start with a lowercase letter (e.g., number, boolean)
// Variables and method names start with a lowercase letter (e.g., main())
// Multi-word names are camel case (e.g., vannaWhite)
// Class constants (i.e., final instance and static variables) are generally all capitalized with words separated by underscores (e.g., const PRIVATE_FINAL_OBJECT = 'MY_MUTEX')
