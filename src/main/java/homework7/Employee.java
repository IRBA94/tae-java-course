/**@author Irakli Barbakadze*/
package homework7;

public abstract class Employee {
    protected String name;

    public Employee(String name){
        this.name=name;
    }

    abstract double calculateSalary();

    void printInfo(){
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Employee[] team = {
                new FullTime("Anna", 5000),
                new PartTime("Beka", 25, 80) };

        for (Employee e : team) {
            e.printInfo();
            System.out.println(e.calculateSalary());
        }
    }

}
