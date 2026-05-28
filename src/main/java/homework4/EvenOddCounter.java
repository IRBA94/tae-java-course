package homework4;

public class EvenOddCounter {
    public static void main(String[] args) {

        int birthYear = 1994;
        int counterEven = 0;
        int counterOdd = 0;

        int lastTwoDigit = birthYear % 100; //ბოლო 2 ციფრის განსაზღვრა

        String evenNumbers = ""; //პრინტში ცალ-ცალკე გამოვიტანოთ ლუწი რიცხვები
        String oddNumbers = ""; //პრინტში ცალ-ცალკე გამოვიტანოთ კენტი რიცხვები

        for (int i = 1; i <= lastTwoDigit; i++) {

            if  (i % 2 == 0) {
                counterEven += 1;
                evenNumbers += i + " "; //თითო იტერაციაზე მივანიჭოთ ლუწი რიცხვები ცლადს
            } else {
                counterOdd += 1;
                oddNumbers += i + " "; //თითო იტერაციაზე მივანიჭოთ კენტი რიცხვები ცლადს

            }
        }


        System.out.println("დაბადების წელი " + birthYear + " -> " + "ბოლო 2 ციფრი = " + lastTwoDigit + ":"
                + "\nლუწი: " + counterEven + "(" + evenNumbers  + ")"
                + "\nკენტი: " + counterOdd + "(" + oddNumbers + ")");


    }

}
