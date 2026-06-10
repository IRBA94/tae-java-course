/** @author Irakli Barbakadze */
package homework6;

public class Calculator {

    public double calculate(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {return Double.NaN;}
                return a / b;

            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.calculate(999, 3, '+'));
        System.out.println(calc.calculate(-237, 5, '-'));
        System.out.println(calc.calculate(1, 0, '/'));
    }
}
