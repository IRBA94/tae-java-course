package homework4;

public class PrimeCheck {
    public static void main(String[] args) {
        int age = 30;
        boolean isPrime = true;
        String divisor = "";

        for (int i = 2; i < age; i++) {

            if (age % i == 0) {
                isPrime = false;
                divisor += i + " ";
                break; //ეს ბრეიქი არის დავალებით გათვალისწინებული, მაგრამ ზღუდავს დაპრინტოს ყველა გამყოფი. პირველივე გამყოფის პოვნისას ციკლი ჩერდება
            }
        }

        if (isPrime) {
            System.out.println("ასაკი = " + age + " -> მარტივია");
        }
        else {
            System.out.println("ასაკი = " + age + " -> არ არის მარტივი (იყოფა " + divisor + ")");
        }
    }

}
