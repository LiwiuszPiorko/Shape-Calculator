import java.awt.*;

public class ShapeCalculatorTest {

    public static void main(String[] args) {

        Square square1 = new Square(5.5);
        ShapeCalculator check = new ShapeCalculator();

        double squareArea = check.squareArea(square1);

        System.out.println(squareArea);

        Triangle triangle1 = new Triangle(5.5, 5.5, 4.4);
        ShapeCalculator triangle = new ShapeCalculator();

        double trianglePerimeter = triangle.trianglePerimeter(triangle1);

        System.out.println(trianglePerimeter);

        Rectangle rectangle1=new Rectangle(5.5, 4.4);
        ShapeCalculator rectangle=new ShapeCalculator();

        double rectPerimeter = rectangle.rectPerimeter(rectangle1);

        System.out.println(rectPerimeter);

        Circle circle1=new Circle(3.14,5.5);
        ShapeCalculator circle=new ShapeCalculator();

        double circleArea=circle.circleArea(circle1);

        System.out.println(circleArea);







    }
}
