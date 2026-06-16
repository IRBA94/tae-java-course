/** @author Irakli Barbakadze */
package homework9;


import java.util.ArrayList;
import java.util.List;

/** NumberStats.java — ArrayList + სტატისტიკა
 0.5 ქულა · ArrayList<Integer> · for-each + max/min/avg
 შექმენი ArrayList<Integer> 5 რიცხვით. დაწერე სამი მეთოდი:
 •
 int findMax(List<Integer> list)
 •
 int findMin(List<Integer> list)
 •
 double average(List<Integer> list)
 main()-ში გამოიძახე სამივე და დაბეჭდე. */

public class NumberStats {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-1);
        list.add(14);
        list.add(21);
        list.add(33);
        list.add(57);

        System.out.println(findMax(list));
        System.out.println(findMin(list));
        System.out.println(average(list));
    }

    public static int findMax(List<Integer> list){

        int max = list.get(0);

        for (int l : list) {
            if (l > max) {
                max = l;
            }
        }

        return max;

    }

    public static int findMin(List<Integer> list){

        int min = list.get(0);

        for (int l : list) {
            if (l < min) {
                min = l;
            }
        }

        return min;

    }

    public static int average(List<Integer> list){

        int sum = 0;

        for (int l : list) {
            sum += l;
        }

        return sum / list.size();

    }


}
