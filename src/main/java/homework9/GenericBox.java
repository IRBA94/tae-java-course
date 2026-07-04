/** @author Irakli Barbakadze */
package homework9;
/** GenericBox.java — Generic Class
 0.5 ქულა · class Box<T>
 შექმენი generic class Box<T>: private field T value; constructor; T get();
 void set(T value). main()-ში გამოცადე 3 ტიპით: Box<String>, Box<Integer>, Box<Double>.
 სასურველი:String box: Hello Integer box: 42 Double box: 3.14 */

public class GenericBox {

    public static void main(String[] args) {

        class Box<T> {

            private T value;

            public Box(T value) {
                this.value = value;
            }

            public T get() {
                return value;
            }

            public void set(T value) {
                this.value = value;
            }
        }

        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(42);
        Box<Double> doubleBox = new Box<>(3.14);

        System.out.println("String box: " + stringBox.get());
        System.out.println("Integer box: " + integerBox.get());
        System.out.println("Double box: " + doubleBox.get());
    }
}
