/**@author Irakli Barbakadze*/
package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];

        animals[0] = new Dog("Dog1");
        animals[1] = new Cat("Cat1");
        animals[2] = new Dog("Dog2");
        animals[3] = new Cat("Cat2");
        for (Animal a: animals){
            if (a instanceof Dog) {
                System.out.print(a.name + " (Dog): ");
            } else if (a instanceof Cat) {
                System.out.print(a.name + " (Cat): ");
            }

            a.makeSound();
            a.sleep();
        }

    }


}
