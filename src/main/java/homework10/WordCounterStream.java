/** @author Irakli Barbakadze */
package homework10;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/** 0.5 ქულა · Stream + groupingBy + counting
 String text = "java git java oop java git python". .split(" ")-ით →
 Stream → დაჯგუფე და დაითვალე:
 Map<String, Long> counts = Arrays.stream(words)
 .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
 სასურველი:{java=3, git=2, oop=1, python=1} */
public class WordCounterStream {
    public static void main(String[] args) {

        String text = "java git java oop java git python";

        String[] words = text.split(" ");

        Map<String, Long> counts = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        w -> w,
                        Collectors.counting()
                ));

        System.out.println(counts);
    }
}
