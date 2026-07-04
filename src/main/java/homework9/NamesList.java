/** @author Irakli Barbakadze */
package homework9;

import java.util.ArrayList;

/** NamesList.java — ArrayList საფუძვლები
 0.5 ქულა · ArrayList<String> · add/get/remove/size
 main()-ში: შექმენი ArrayList<String> names, დაამატე 5 სახელი (1 — შენი),
 დაბეჭდე ზომა და პირველი/ბოლო ელემენტი. შემდეგ წაშალე ერთი (index 2),
 დაბეჭდე names.contains("Anna"), შემდეგ for-each-ით დაბეჭდე ყველა.
 სასურველი:Size: 5 First: <შენი სახელი>, Last: Eka Contains Anna? true [სია for-each-ით]*/

public class NamesList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Irakli");
        names.add("Anna");
        names.add("Gaga");
        names.add("Makrine");
        names.add("Lazare");

        System.out.println(names.size());
        System.out.println("First name in array: " + names.get(0));
        System.out.println("last name in array: " + names.get(4));

        names.remove(2);
        System.out.println("Contains: " + names.contains("Anna\n"));

        System.out.println("----------------");
        System.out.println("For-each: ");

        for (String n: names){
            System.out.println(n);
        }




    }
}
