/** @author Irakli Barbakadze */
package homework10;

import java.util.Arrays;
import java.util.List;

/**0.5 ქულა · reduce + mapToInt
 სამი ცდა List.of(1, 2, 3, 4, 5)-ზე:
 •
 ჯამი: .reduce(0, Integer::sum)
 •
 ნამრავლი: .reduce(1, (a, b) -> a * b)
 •
 მაქს: .reduce(Integer::max)
 სასურველი:Sum: 15 Product: 120 Max: 5 */
public class ReduceSum {
    public static void main(String[] args) {

        //List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        int sum = nums.stream()
                .reduce(0, Integer::sum);

        int product = nums.stream()
                .reduce(1, (a, b) -> a * b);

        int max = nums.stream()
                .reduce(Integer::max)
                .orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + max);
    }
}
