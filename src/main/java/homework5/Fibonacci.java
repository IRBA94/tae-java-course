package homework5;

public class Fibonacci {
    public static long fib(int n) {
        if (n == 0) {return 0;}
        if (n == 1) {return 1;}

        long x = 0;
        long y = 1;
        long result = 0;

        for (int i = 2; i <= n; i++) {
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(fib(20));
        System.out.println(fib(25));
        System.out.println(fib(0));
        System.out.println(fib(1));
    }

}
