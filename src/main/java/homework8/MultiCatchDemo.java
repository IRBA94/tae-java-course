/** @author Irakli Barbakadze */
package homework8;

/** 0.5 ქულა · 3+ catch blocks
 დაწერე მეთოდი void processInput(String input), რომელიც:
 1) Integer.parseInt(input) - გადააქცევს რიცხვად;
 2) აპურს int[] arr = {10, 20};
 3) აბრუნებს arr[result] / result. სამი catch ბლოკი — NumberFormatException,
 ArrayIndexOutOfBoundsException, ArithmeticException. თითო catch-ში სხვადასხვა შეტყობინება.
 მაგ.processInput("abc") → NumberFormatException processInput("0") →
 ArithmeticException processInput("99") → ArrayIndexOutOfBoundsException*/

public class MultiCatchDemo {
    public static void processInput(String input){
        try {
            int result = Integer.parseInt(input);

            int[] arr = {10, 20};

            int divResult = arr[result] / result;

            System.out.println("Result: " + divResult);
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }

    public static void main(String[] args) {

        processInput("abc");
        processInput("0");
        processInput("99");
        //processInput("1");
}
}
