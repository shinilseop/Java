package chapter7_OOP2;

public class Circle extends Shape {
    double r;

    Circle(double r) {
        this(new Point(0, 0), r);
    }

    Circle(Point p, double r) {
        super(p);
        this.r=r;
    }

    @Override
    double calcArea() {
        return r*r*Math.PI;
    }
}
