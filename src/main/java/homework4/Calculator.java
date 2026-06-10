package homework4;

public class Calculator {
    public static void main(String[] args) {
        double a = 10;
        double b = 0;
        double c;
        char op = '/';

        switch (op) {

            case '/':
                if (b == 0) {
                    System.out.println("ნულზე გაყოფა აკრძალულია");
                } else {
                    c = a / b;
                    System.out.println(c);
                }
                break;
            case '+':
                c = a + b;
                System.out.println(c);
                break;

            case '-':
                c = a - b;
                System.out.println(c);
                break;

            case '*':
                c = a * b;
                System.out.println(c);
                break;

            default:
                System.out.println("უცნობი ოპერატორი");
        }


    }

}
