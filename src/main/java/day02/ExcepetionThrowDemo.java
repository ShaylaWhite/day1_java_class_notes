package day02;

public class ExcepetionThrowDemo {
    public static void divideAndAssignValue(int[] arr, int numerator, int denominator, int index)
            throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }

        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Incorrect array index");
        }

        arr[index] = numerator / denominator;
    }

    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
            divideAndAssignValue(arr, 20, 0, 1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}