/**@author Irakli Barbakadze*/
package homework7;

public abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name=name;
    }

    public abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.makeSound();
        d.sleep();
        // Bark! Rex is sleeping

//        Cat c = new Cat("piso");
//        c.makeSound();
//        c.sleep();
    }
}
