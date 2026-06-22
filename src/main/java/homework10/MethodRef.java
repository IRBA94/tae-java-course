/** @author Irakli Barbakadze */
package homework10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** 0.5 ქულა · System.out::println · String::toUpperCase
 სამი მაგალითი:
 •
 names.forEach(System.out::println)
 •
 Stream.map(String::toUpperCase) → List
 •
 Stream.map(Integer::parseInt) ცდაზე ["1","2","3"] */
public class MethodRef {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("irakli", "lazare", "makrine");

        names.forEach(System.out::println);

        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);

        List<String> strings = Arrays.asList("1", "2", "3");

        List<Integer> numbers = strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
