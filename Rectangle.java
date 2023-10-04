package chapter13;
public class Rectangle extends GeometricObject {
    private double height = 1;
    private double length = 1;

    @Override
    public double getArea() {
        return (length * height);
    }

    @Override
    public double getPerimeter() {
        return ((2 * length) + (2 * height));
    }
}