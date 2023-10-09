package chapter13;

import java.awt.*;

public class GeoObjectTest {
    public static void main(String []args) {
        Circle circle = new Circle();
        circle.printCircle();
        GeometricObject geoObj;
        geoObj = new Circle();
        //GeometricObject geoObj2 = new GeometricObject();
        Rectangle rectangle = new Rectangle();
        GeometricObject geoObj3 = new Rectangle();
        //System.out.println(Rectangle.toString());
    }
}
