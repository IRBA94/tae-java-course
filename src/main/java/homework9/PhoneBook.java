/** @author Irakli Barbakadze */
package homework9;

import java.util.HashMap;

/** PhoneBook.java — HashMap
 0.5 ქულა · HashMap<String,String> · put/get/containsKey
 შექმენი HashMap<String, String> სახელი→ნომერი. დაამატე 4 ჩანაწერი (ერთი — შენი).
 მეთოდი String findPhone(String name) — დააბრუნოს ნომერი ან „არ მოიძებნა".
 main()-ში 2 ცდა (ერთი ნამდვილი, ერთი არასწორი) + for-each keySet-ით ყველა keys+values.*/

public class PhoneBook {
    static  HashMap<String, String> phoneNumbers = new HashMap<String, String>();
    public static void main(String[] args) {


        phoneNumbers.put("Irakli", "555 11 11 11");
        phoneNumbers.put("Makrine", "555 11 11 12");
        phoneNumbers.put("Lazare", "555 11 11 13");
        phoneNumbers.put("Vakho", "555 11 11 14");

        System.out.println(findPhone("Irakli"));
        System.out.println(findPhone("Petre"));

        for (String k : phoneNumbers.keySet()){
            System.out.println(k + " : " + phoneNumbers.get(k));
        }
    }

    public static String findPhone(String name){
        return phoneNumbers.getOrDefault(name, "არ მოიძებნა");
    }
}
