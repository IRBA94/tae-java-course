/**@author Irakli Barbakadze*/
package homework7;

public abstract class Vehicle {

    protected String brand;

    public Vehicle(String brand){
        this.brand=brand;
    }
    abstract void start();

    void stop(){
        System.out.println(brand + " stopped");
    }

    public static void main(String[] args) {
        new Car("Toyota").start();
        new Bike("Trek").stop();
    }
}


