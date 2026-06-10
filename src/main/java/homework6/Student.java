/** @author Irakli Barbakadze */
package homework6;

public class Student {

    String name;
    int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public double averageGrade() {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return (double) sum / grades.length;
    }

    public String getStatus() {
        double average = averageGrade();

        if (average >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Student("ირაკლი", new int[]{0, 0, 11}).getStatus());
        System.out.println(new Student("ირაკლი1", new int[]{10, 50, 60}).getStatus());
        System.out.println(new Student("ირაკლი2", new int[]{50, 88, 61}).getStatus());
    }
}
