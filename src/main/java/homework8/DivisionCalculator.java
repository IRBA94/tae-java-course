/** @author Irakli Barbakadze */
package homework8;

//*0.5 ქულა · try-catch · ArithmeticException
//დაწერე მეთოდი int safeDivide(int a, int b), რომელიც აბრუნებს a/b-ს.
// გადააფარე try-catch-ით — თუ b == 0 → ArithmeticException.
// catch-ში დაბეჭდე „ნულზე გაყოფა" და დააბრუნე 0. main()-ში გამოცადე ორი ცდით: (10, 2) და (5, 0).
//სასურველი:safeDivide(10, 2) → 5 safeDivide(5, 0) → ნულზე გაყოფა, returns 0*//

public class DivisionCalculator {

    public static int safeDivide(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("ნულზე გაყოფა");
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(safeDivide(10, 2));
        System.out.println("\n");
        System.out.println(safeDivide(5, 0));
    }


}
