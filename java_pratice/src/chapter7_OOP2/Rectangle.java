package chapter7_OOP2;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width*height;
    }

    public boolean isSquare() {
        return width * height != 0 && width == height;
    }
}
