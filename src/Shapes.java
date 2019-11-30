import java.awt.*;
import javax.swing.*;
import com.stanevich.shapes.*;

import com.stanevich.shapes.Point;
import com.stanevich.shapes.Rectangle;

public class Shapes
{
    public static void main(String[] args)
    {
        Point p1Triangle = new Point(2,1);
        System.out.println(p1Triangle.x);
        System.out.println(p1Triangle.y);
        Point p2Triangle = new Point(2,4);
        System.out.println(p2Triangle.x);
        System.out.println(p2Triangle.y);
        Point p3Triangle = new Point(-2,5);
        System.out.println(p3Triangle.x);
        System.out.println(p3Triangle.y);
        Triangle triangle1 = new Triangle( p1Triangle, p2Triangle, p3Triangle);

        Point xY = new Point(3,2);
        System.out.println(xY.x);
        System.out.println(xY.y);

        Point p1Circle = new Point(2,1);
        System.out.println(p1Circle.x);
        System.out.println(p1Circle.y);
        int r = 0;
        Circle circle1 = new Circle(p1Circle, r);

        Point p1Rectangle = new Point(6,3);
        System.out.println(p1Rectangle.x);
        System.out.println(p1Rectangle.y);
        Point p2Rectangle = new Point(5,-3);
        System.out.println(p2Rectangle.x);
        System.out.println(p2Rectangle.y);
        Point p3Rectangle = new Point(-5,7);
        System.out.println(p3Rectangle.x);
        System.out.println(p3Rectangle.y);
        Point p4Rectangle = new Point(-5,-3);
        System.out.println(p4Rectangle.x);
        System.out.println(p4Rectangle.y);
        Rectangle rectangle1 = new Rectangle(p1Rectangle, p2Rectangle, p3Rectangle, p4Rectangle);

        Point p1Square = new Point(6,3);
        System.out.println(p1Square.x);
        System.out.println(p1Square.y);
        Point p2Square = new Point(5,-3);
        System.out.println(p2Square.x);
        System.out.println(p2Square.y);
        Point p3Square = new Point(-5,7);
        System.out.println(p3Square.x);
        System.out.println(p3Square.y);
        Point p4Square = new Point(-5,-3);
        System.out.println(p4Square.x);
        System.out.println(p4Square.y);
        Square square1 = new Square(p1Square, p2Square, p3Square, p4Square);

    }

}
