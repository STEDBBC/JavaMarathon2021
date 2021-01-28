package day9.Task2;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle( int width, int height,String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        double s;
        s = width * height;
        return s;
    }

    @Override
    public double perimeter() {
        double p;
        p = (width+height)*2;
        return p;
    }
}
