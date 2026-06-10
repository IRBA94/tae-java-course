package homework5;

public class SumEvents {
    public static int sumEvents(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) { //გადაეცი 1-დან ტქბენი ასაკის გაორმაგებამდე - ვინაიდან "გაორმაგებამდეა" მოთხოვნილი i < to
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvents(1, 62));
    }
}
