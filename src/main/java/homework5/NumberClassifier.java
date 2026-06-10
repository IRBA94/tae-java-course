package homework5;

public class NumberClassifier {
    public static String classify(int n) {
        if (n > 0) return "Positive";
        else if (n < 0) return "Negative";
        else return "Zero";
    }

    public static String classify(double n) {
        String s;
        if (n > 0) s = "Positive";
        else if (n < 0) s = "Negative";
        else s = "Zero";

        if ( n % 1 == 0) return s + " - Whole double";
        else {return s + " - Decimal";}

    }

    public static void main(String[] args) {
        System.out.println(classify(-5));
        System.out.println(classify(3.14));
        System.out.println(classify(7.0));
        System.out.println(classify(0));


    }
}
