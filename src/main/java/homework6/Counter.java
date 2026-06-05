/** @author Irakli Barbakadze */
package homework6;

public class Counter {
    int count;
    int maxValue;


    public Counter(int count, int maxValue){
        this.count = count;
        this.maxValue = maxValue;
    }

    void increment(){
        if(count < maxValue){
            count++;
        }
    }

    void reset(){
        count = 0;
    }

    void countTo(int target){
        for (int i = 1; i <= target; i++){ //for ციკლი 1-დან target-მდე წერია დავალებაში, მაგრამ main ში ველოდებით 5, ამიტომ <=
            increment();
        }
    }

    public static void main(String[] args) {
        Counter c = new Counter(0, 100);
        c.countTo(5);
        System.out.println(c.count);
    }
}