/**@author Irakli Barbakadze*/
package homework7;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;

    }

    @Override
    public double area() {
        return width * height;
    }

    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        System.out.println(s1.area());

        Shape s2 = new Circle(3);
        System.out.printf("%.2f%n", s2.area());// თუ მეასედებამდე ვამრგვალებთ "%.2f%n" და printf
    }
}
