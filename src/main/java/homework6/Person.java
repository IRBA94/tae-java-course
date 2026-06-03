/** @author Irakli Barbakadze */
package homework6;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void introduce() {
        System.out.println("გამარჯობა, მე ვარ " + name + ", " + age + " წლის.\n");
    }


    public static void main(String[] args) {


        new Person("ირაკლი", 31, "ibarbakadze@credo.ge").introduce();
        new Person("ბანგარანგა", 17, "bangaranga@bangaranga.com").introduce();

       /**დავალების მიხედვით, მაგალითში ჩანს getter-ების ბეჭვდაც.
        ფაილის სტრუქტურაში კი მხოლოდ .introduce(); ბეჭვა.
        ქვემოთ ვაკომენტარებ ცალკე gettere ების ბეჭვდის შესაძ₾ებლობას **/

       /**

        Person person1 = new Person("ირაკლი", 31, "ibarbakadze@credo.ge");
        Person person2 = new Person("ბანგარანგა", 17, "bangaranga@bangaranga.com");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getEmail());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getEmail());
        **/

    }


}