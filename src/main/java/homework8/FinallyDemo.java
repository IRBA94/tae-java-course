/** @author Irakli Barbakadze */
package homework8;
/** დაწერე მეთოდი int readNumber(String s): try-ში — Integer.parseInt(s).
 * catch-ში — NumberFormatException → ბეჭდე შეცდომა და დააბრუნე -1.
 * finally-ში დაბეჭდე „დასრულდა readNumber" (ყოველთვის).
 * main()-ში გამოცადე ორი ცდით: "100" და "xyz" — შეადარე რა ჯერ იბეჭდება ერთშიც და მეორეშიც. */
public class FinallyDemo {
    public static int readNumber(String s){
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("შეცდომა: " + s);
            return -1;
        }
        finally {
            System.out.println("დასრულდა readNumber");
        }
    }

    public static void main(String[] args) {

        System.out.println(readNumber("100"));
        System.out.println("\n");
        System.out.println(readNumber("xyz"));

    }
}
