package homework4;

public class GradeCalculator {
    public static void main(String[] args) {
        int birthMonth = 13;

       if (birthMonth <= 2) {
            System.out.println("თვე = " + birthMonth + " -> შეფასება 'F'");
        }
        else if (birthMonth <= 5) {
            System.out.println("თვე = " + birthMonth + " -> შეფასება 'D'");
        }
        else if (birthMonth <= 8) {
            System.out.println("თვე = " + birthMonth + " -> შეფასება 'C'");
        }
        else if (birthMonth <= 11) {
            System.out.println("თვე = " + birthMonth + " -> შეფასება 'B'");
        }
       else if (birthMonth <= 12) {
           System.out.println("თვე = " + birthMonth + " -> შეფასება 'A'");
       }
        else {
            System.out.println("თვე ცდება 1-12 შუალედს");
        }
    }
}
