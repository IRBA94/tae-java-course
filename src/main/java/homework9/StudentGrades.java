/** @author Irakli Barbakadze */
package homework9;

import java.util.Arrays;
import java.util.*;

/** StudentGrades.java — Nested Collection
 0.5 ქულა · Map<String, List<Integer>> · ჩაგმული Collection
 შექმენი HashMap<String, List<Integer>> — სტუდენტი → ქულების სია. დაამატე 3 სტუდენტი თითო 4
 ქულით. დაწერე მეთოდი double averageFor(String name) — დააბრუნოს ცალკე სტუდენტის საშუალო. */
public class StudentGrades {
    static HashMap<String, List<Integer>> studentGrades = new HashMap<>();

    public static void main(String[] args) {

        studentGrades.put("Irakli", Arrays.asList(85,92,78,90));
        studentGrades.put("Makrine", Arrays.asList(70,65,80,75));
        studentGrades.put("Lazare", Arrays.asList(95,98,92,100));


        for (String name : studentGrades.keySet()) {
            double avg = averageFor(name);
            System.out.println(name + "'s average: " + avg + studentGrades.get(name));
        }
    }

    public static double averageFor(String name) {
        List<Integer> grades = studentGrades.get(name);

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }
}
