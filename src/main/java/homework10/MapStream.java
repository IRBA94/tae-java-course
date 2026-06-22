/** @author Irakli Barbakadze */
package homework10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** 0.5 ქულა · Stream.map + collect
 List<String> names = List.of("Anna", "Beka", "Cita"). Stream-ით გადააქციე:
 •
 UPPERCASE-ში → collect List
 •
 ცალკე — სიგრძეებად (Integer) → collect List
 სასურველი:[ANNA, BEKA, CITA] [4, 4, 4]*/
public class MapStream {
    public static void main(String[] args) {

        //List<String> names = List.of("Anna", "Beka", "Cita");
        List<String> names = Arrays.asList("Anna", "Beka", "Cita");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(upperNames);
        System.out.println(lengths);
    }
}
