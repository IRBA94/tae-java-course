/** @author Irakli Barbakadze */
package homework6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Bark!");
    }

    public static void main(String[] args) {
        new Dog("Rex").makeSound();
    }
}
