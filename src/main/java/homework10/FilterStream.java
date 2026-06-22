/** @author Irakli Barbakadze */
package homework10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** 0.5 ქულა · Stream.filter + collect
 List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10). Stream-ით:
 •
 გაფილტრე მხოლოდ ლუწი რიცხვები
 •
 collect to List
 •
 დაბეჭდე შედეგი
 სასურველი:[2, 4, 6, 8, 10]*/
public class FilterStream {

    public static void main(String[] args) {

        //List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); javas ვერსია არ აქვს List.of
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
