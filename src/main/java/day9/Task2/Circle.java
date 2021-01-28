package day9.Task2;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double s = 0;
        s = 3.14 * (radius * radius);
        return s;
    }

    @Override
    public double perimeter() {
        double p;
        p = radius*(3.14*3.14);
        return p;
    }
}
