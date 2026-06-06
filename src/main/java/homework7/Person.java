/**@author Irakli Barbakadze*/
package homework7;

import java.util.Arrays;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Person[] people = new Person[4];


        people[0] = new Person("Anna", 25);
        people[1] = new Person("Beka", 30);
        people[2] = new Person("Cita", 22);
        people[3] = new Person("Irakli", 31);

        Arrays.sort(people);

        for (Person p : people) {
            System.out.println(p.toString());
            
        }
    }
}
