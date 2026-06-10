/** @author Irakli Barbakadze */
package homework8;
/** 0.5 ქულა · throws · multiple exceptions
 დაწერე მეთოდი int processAge(String input) throws NumberFormatException, IllegalArgumentException:
 •
 Integer.parseInt(input) — შესაძლოა NumberFormatException
 •
 თუ age < 0 → throw IllegalArgumentException
 •
 აბრუნე age * 12 (თვეებში)
 main()-ში გამოიყენე try-catch ორი ცალკე catch-ით.*/
public class InputValidator {
    public static int processAge(String input)
            throws NumberFormatException, IllegalArgumentException {

        int age = Integer.parseInt(input);

        if (age < 0) {
            throw new IllegalArgumentException("ასაკი უარყოფითია, შეიყვანეთ სწორი მონაცმი: " + age);
        }

        return age * 12;
    }

    public static void main(String[] args) {

        String[] values = {"10", "-10", "Irakli"};

        for (String v : values) {
            try {
                System.out.println("ასაკი თვეებში: " + processAge(v));

            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException: შეყვანილი მონაცემი არ არის რიცხვი: " + v);

            }
            catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException: " + e.getMessage());

            }
        }
    }
}
