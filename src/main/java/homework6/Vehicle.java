/** @author Irakli Barbakadze */
package homework6;

public class Vehicle {
    protected String brand; //ვინაიდან Car კლასში ვაკეთებთ extends გადავიყვანე აქ protected-ზე
    protected int year;

    public  Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void info() {
        System.out.println("info");
    }
}
