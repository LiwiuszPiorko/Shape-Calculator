public class ShapeCalculator {


    double squareArea(Square square){

        double sa= square.a*square.a;

        return sa;

    }

    double circleArea(Circle circle){

        double ca=2*(circle.a*circle.pi);

        return ca;

    }

    double trianglePerimeter(Triangle triangle){

        double tp= triangle.a + triangle.b + triangle.c;

        return tp;

    }

    double rectPerimeter(Rectangle rectangle){

        double rp= 2*rectangle.a+2*rectangle.b;

        return rp;

    }
}
