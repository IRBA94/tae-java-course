/** @author Irakli Barbakadze */
package homework9;

import java.util.ArrayList;
import java.util.List;

/**0.5 ქულა · <T> generic method
 დაწერე generic მეთოდი <T> void printList(List<T> list), რომელიც for-each-ით ბეჭდავს ყველა
 ელემენტს. ასევე <T> T getFirst(List<T> list) — აბრუნებს პირველს. main()-ში — გამოცადე ორი
 ტიპით: List<String> და List<Integer>.
 * */

public class ListUtilities {

    public static <T> void printList(List<T> list) {
        for (T i : list) {
            System.out.println(i);
        }
    }

    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Irakli");
        names.add("Makrine");
        names.add("Lazare");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(17);
        numbers.add(111);

        System.out.println("String List:");
        printList(names);
        System.out.println("First: " + getFirst(names));

        System.out.println();

        System.out.println("Integer List:");
        printList(numbers);
        System.out.println("First: " + getFirst(numbers));
    }


}
