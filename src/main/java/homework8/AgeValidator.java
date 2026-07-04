/** @author Irakli Barbakadze */
package homework8;
/** 0.5 ქულა · Custom Exception · throw · throws
 ორი ფაილი:
 •
 InvalidAgeException extends Exception — constructor String message-ით (იძახებს super(message))
 •
 AgeValidator — მეთოდი void validate(int age) throws InvalidAgeException. თუ age < 0 ან >
 150 → throw new InvalidAgeException("..."). main()-ში try-catch-ით გამოცადე: 25 (ok), -5
 (exception), 200 (exception).*/

public class AgeValidator {
    public AgeValidator() {

    }

    public static void validate(int age) throws InvalidAgeException {

        if (age < 0 || age > 150) {
            throw new InvalidAgeException(age + "(ასაკი არის ზღვარს გარეთ)");
        }

        System.out.println(age + "(ok)");
    }

    public static void main(String[] args) {


        int[] ages = {25, -5, 200};

        for (int age : ages) {
            try {
                validate(age);
            } catch (InvalidAgeException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
