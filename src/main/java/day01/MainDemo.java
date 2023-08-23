package day01;

public class MainDemo {

    public static void getSum() {
        int sum = 2 + 2;
        System.out.println(sum);
    }

    public static int returnSum(){
        int sum = 2 + 6;
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
   // getSum();
        int returnValue = returnSum();
        System.out.println(returnValue);
    }
}
