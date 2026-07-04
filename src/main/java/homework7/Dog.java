/**@author Irakli Barbakadze*/
package homework7;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}
