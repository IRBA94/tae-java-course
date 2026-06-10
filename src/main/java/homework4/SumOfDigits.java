package homework4;

public class SumOfDigits {
    public static void main(String[] args) {
        int birthYear = 1994;
        int copyBirthYear = birthYear; //საჭიროა იმისათვის რომ, პრინტლაინი აეწყოს დავალების მიხედვით
        int sumOfYearDigits = 0;
        String numbers = "";
        int digits = 0;
        while (copyBirthYear > 0) {

            int digit = copyBirthYear % 10;
            //System.out.println(copyBirthYear);
            numbers += digit + "+";
            sumOfYearDigits += digit;
            digits++;
            copyBirthYear = copyBirthYear / 10;
            //System.out.println(copyBirthYear);



        }
        System.out.println("წელი = " + birthYear + ": " + "(" + numbers + ")" + " = " + sumOfYearDigits);
    }
}
