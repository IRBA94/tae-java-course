/** @author Irakli Barbakadze */
package homework8;

/** 0.5 ქულა · try-catch · NullPointerException
 დაწერე მეთოდი int safeLength(String s), რომელიც აბრუნებს s.length().
 გადააფარე try-catch-ით — NullPointerException შემთხვევაში დაბეჭდე „null სტრიქონი" და დააბრუნე 0.
 main()-ში გადაეცი 2 მნიშვნელობა: "Hello" და null.
 სასურველი:safeLength("Hello") → 5 safeLength(null) → null სტრიქონი, returns 0*/

public class NullCheck {
    public static int safeLength(String s){


        try {
            return  s.length();
        }
        catch (NullPointerException e){
            System.out.println("null სტრიქონი");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(safeLength("Hello"));
        System.out.println("\n");
        System.out.println(safeLength(null));
    }
}
