/** @author Irakli Barbakadze */
package homework8;

/**0.5 ქულა · try-catch · NumberFormatException
 დაწერე მეთოდი int parseSafe(String s), რომელიც აბრუნებს Integer.parseInt(s).
 გადააფარე try-catch-ით — NumberFormatException შემთხვევაში დაბეჭდე „არ არის რიცხვი: " + s და დააბრუნე 0.
 main()-ში — სამი ცდა: "42", "abc", "".სასურველი:parseSafe("42") → 42
 parseSafe("abc") → არ არის რიცხვი: abc, returns 0 parseSafe("") → არ არის რიცხვი: , returns 0**/

public class StringToNumber {
    public static int parseSafe(String s){

        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("არ არის რიცხვი: " + s);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(parseSafe("42"));
        System.out.println("\n");
        System.out.println(parseSafe("abc"));
        System.out.println("\n");
        System.out.println(parseSafe(""));
    }
}
