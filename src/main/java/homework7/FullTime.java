/**@author Irakli Barbakadze*/
package homework7;

public class FullTime extends Employee {

    private double monthlySalary;


    public FullTime(String name, double monthlySalary) {
        super(name);
        this.monthlySalary=monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}
