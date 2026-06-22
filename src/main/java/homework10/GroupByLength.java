/** @author Irakli Barbakadze */
package homework10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** 0.5 ქულა · groupingBy
 List<String> words = List.of("a", "bb", "cc", "ddd", "ee", "fff").
 Stream-ით ჯგუფირე სიგრძით → Map<Integer, List<String>>.
 სასურველი:{1=[a], 2=[bb, cc, ee], 3=[ddd, fff]}*/
public class GroupByLength {
    public static void main(String[] args) {
        //List<String> words = List.of("a", "bb", "cc", "ddd", "ee", "fff");
        List<String> words = Arrays.asList("a", "bb", "cc", "ddd", "ee", "fff");
        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);

    }

}
