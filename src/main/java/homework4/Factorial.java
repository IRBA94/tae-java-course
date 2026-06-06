package homework4;


public class Factorial {
    public static void main(String[] args) {

        int birthMonth = 7;
        long birthMonthFactoril = 1;
        String numbers = "";


        for (int i = 1; i <= birthMonth; i++) {

            birthMonthFactoril = birthMonthFactoril * i;
            numbers += i + " ";

        }
        System.out.println("დაბადების თვე = " + birthMonth + ":" + birthMonth +"! = " + numbers +
                " = " + birthMonthFactoril);

    }
}
