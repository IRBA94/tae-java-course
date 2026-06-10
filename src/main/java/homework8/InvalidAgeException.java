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

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);

    }
}
