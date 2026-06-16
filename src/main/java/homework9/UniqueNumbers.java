/** @author Irakli Barbakadze */
package homework9;

import java.util.HashSet;

/** UniqueNumbers.java — HashSet
 0.5 ქულა · HashSet<Integer> · უნიკალურობა
 მოცემული int[] arr = {1, 2, 3, 2, 4, 1, 5}. შექმენი HashSet<Integer>, ჩაამატე ყველა ელემენტი,
 დაბეჭდე უნიკალურები + მათი რაოდენობა. შემდეგ შეამოწმე contains(3) და contains(10).
 სასურველი:Unique: [1,2,3,4,5] Size: 5 Contains 3? true Contains 10? false */

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> nums = new HashSet<>();


        for(int i : arr){
            nums.add(i);
        }
        System.out.println("Unique: " + nums);
        System.out.println("Size: " + nums.size());
        System.out.println("Contains 3?: " + nums.contains(3));
        System.out.println("Contains 3?: " + nums.contains(10));

    }
}
