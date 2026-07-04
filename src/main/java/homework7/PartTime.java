/**@author Irakli Barbakadze*/
package homework7;

public class PartTime extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
