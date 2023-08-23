package day01;

public class InClassMethods {
    /**
     *
     * @param number
     * @return
     */
    public static double divide152By(double number) {
        double result = 152.0 / number;
        return result;
    }

    public static double transmogrifier(double num1, double num2, double num3) {
        double result = Math.pow(num1 * num2, num3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide152By(3));   // Output: 50.666666666666664
        System.out.println(divide152By(43));  // Output: 3.5348837209302325
        System.out.println(divide152By(8));   // Output: 19.0

        System.out.println(transmogrifier(5, 4, 3));    // Output: 125.0
        System.out.println(transmogrifier(13, 12, 5));  // Output: 648271.0
        System.out.println(transmogrifier(42, 13, 7));  // Output: 1.24160285272832E14
    }
}

