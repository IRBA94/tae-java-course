package homework5;

public class DigitCounter {
    public static int countDigits(int n) {
        int count = 0;
        n = Math.abs(n);

        if (n == 0) {return 1;}

        while (n != 0) {
            n = n / 10;
            count += 1;

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(1994));
        System.out.println(countDigits(-100));
        System.out.println(countDigits(0));

    }
}
