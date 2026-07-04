/**@author Irakli Barbakadze*/
package homework7;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " engine started");
    }


}
