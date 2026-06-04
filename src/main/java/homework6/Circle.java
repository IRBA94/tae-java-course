/** @author Irakli Barbakadze */
package homework6;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(new Rectangle(4, 5).area());
        System.out.println(new Circle(3).area());
    }
}
