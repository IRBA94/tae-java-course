/** @author Irakli Barbakadze */
package homework8;

/**ArrayReader.java — ArrayIndexOutOfBoundsException
 0.5 ქულა · try-catch · ArrayIndexOutOfBoundsException
 დაწერე მეთოდი int readSafe(int[] arr, int index). try-ში დააბრუნე arr[index].
 catch-ში (ArrayIndexOutOfBoundsException) დაბეჭდე „ინდექსი არასწორი: " + index და დააბრუნე -1.
 main()-ში გამოცადე ორ ცდით — სწორი და არასწორი ინდექსით.
 მაგ.int[] nums */

public class ArrayReader {

    public static int readSafe(int[] arr, int index){
        try {
            return arr[index];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ინდექსი არასწორი: " + index);
            return -1;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(readSafe(nums,2));
        System.out.println("\n");
        System.out.println(readSafe(nums,20));

    }
}
