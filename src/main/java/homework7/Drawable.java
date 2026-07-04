/**@author Irakli Barbakadze*/
package homework7;

public interface Drawable {
    void draw();

    public static void main(String[] args) {
        Drawable[] figure = new Drawable[3];

        figure[0] = new Square();
        figure[1] = new Triangle();
        figure[2] = new Star();

        for (Drawable f : figure) {
            f.draw();
        }
    }
}
