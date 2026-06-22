/** @author Irakli Barbakadze */
package homework10;

import java.util.Comparator;
import java.util.function.Predicate;

//* 0.5 ქულა · Runnable, Comparator, Predicate Lambda-ით
//3 მაგალითი main()-ში:
//•
//Runnable r = () -> System.out.println("Hello Lambda") — გაუშვი r.run()
//•
//Predicate<Integer> isEven = n -> n % 2 == 0 — გამოცადე 5 და 6
//•
//Comparator<String> byLength = (a, b) -> a.length() - b.length()*/
public class LambdaBasics {
    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello Lambda");
        r.run();

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));

        Comparator<String> byLength = (a, b) -> a.length() - b.length();

        System.out.println(byLength.compare("Irakli", "Barbakadze"));
        System.out.println(byLength.compare("Lambda", "Basics"));
    }
}
