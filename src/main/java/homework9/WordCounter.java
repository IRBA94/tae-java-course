/** @author Irakli Barbakadze */
package homework9;

import java.util.HashMap;

/** WordCounter.java — Map სიხშირისთვის
 0.5 ქულა · HashMap<String,Integer> · containsKey + ციკლი
 მოცემული String წინადადება (მაგ. „java git java oop java git python").
 split(" ")-ით გაყავი სიტყვებად. HashMap-ში დაითვალე თითო სიტყვის სიხშირე —
 if containsKey → count+1, else → put(1). დაბეჭდე map-ი.
 სასურველი:{java=3, git=2, oop=1, python=1} */
public class WordCounter {
    public static void main(String[] args) {
        String text = "java git java oop java git python";

        String[] words = text.split(" ");

        HashMap<String, Integer> newHasMap = new HashMap<>();

        for (String word : words) {

            if (newHasMap.containsKey(word)) {
                newHasMap.put(word, newHasMap.get(word) + 1);
            } else {
                newHasMap.put(word, 1);
            }
        }

        System.out.println(newHasMap);
    }
}
