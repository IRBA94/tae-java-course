/**@author Irakli Barbakadze*/
package homework7;

public class Bike extends Vehicle{
    public Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " pedaling...");
    }


}
