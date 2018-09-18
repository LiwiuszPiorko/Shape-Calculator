public class ShapeCalculator {

    double a;
    double b;
    double c;


    double squareArea(double a){

        double sa= a*a;

        return sa;

    }

    double circleArea(double a, double b){

        double ca=2*a*b;

        return ca;

    }

    double trianglePerimeter(double a, double b, double c){

        double tp= a+b+c;

        return tp;

    }

    double rectPerimeter(double a, double b){

        double rp= 2*a+2*b;

        return rp;

    }
}
