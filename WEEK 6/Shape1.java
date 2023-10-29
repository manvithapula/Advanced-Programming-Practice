//RA2211003010001 Week 6 Q5
import java.lang.Math;
class Shape01 {
    public double getPerimeter() {
        return 0.0;
    }
    public double getArea() {
        return 0.0;
    }
}
class Circle extends Shape01 {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Shape1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
