package homework5;

public class MultiplicationTable {
    public static void printTable(int n){
        for (int i = 1; i < 10; i++) {// i< 10, ვინაიდან დავალებაში მოტხოვნილია "1-დან 10-მდე"
            int print = n *  i;
            System.out.print(n + " * " + i + " = " + print + "\n");
        }
    }

    public static void main(String[] args) {
        printTable(10);
    }
}
