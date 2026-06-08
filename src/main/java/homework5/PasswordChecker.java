package homework5;

public class PasswordChecker {
    public static boolean isStrong(String password) {

        if (password.length() < 8) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < password.length(); i++) {
            char pass = password.charAt(i);

            if (Character.isDigit(pass)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(pass)) {
                hasUpper = true;
            }


        }
        return hasDigit && hasUpper;
    }

    public static void main(String[] args) {

        String pass1 = "iraK1234";
        String pass2 = "iraklii1";
        String pass3 = "IRAKLIII";
        String pass4 = "Irakliii";


        System.out.println(pass1 + ": " + isStrong(pass1));
        System.out.println(pass2 + ": " + isStrong(pass2));
        System.out.println(pass3 + ": " + isStrong(pass3));
        System.out.println(pass4 + ": " + isStrong(pass4));
    }
}
