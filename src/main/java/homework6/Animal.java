/** @author Irakli Barbakadze */
package homework6;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("some sound");
    }
}