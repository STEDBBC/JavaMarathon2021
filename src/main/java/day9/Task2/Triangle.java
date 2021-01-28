package day9.Task2;

public class Triangle extends Figure {
    private int sideLength1;
    private int sideLength2;
    private int sideLength3;

    public Triangle(int sideLength1, int sideLength2, int sideLength3,String color) {
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }
    @Override
    public double area() {
        double s, p;
        p = (sideLength1 + sideLength2 + sideLength3) / 2;
        s = Math.sqrt(p * (p - sideLength1) * (p - sideLength2) * (p - sideLength3));
        return s;
    }
    @Override
    public double perimeter() {
        double p;
        p = sideLength1 + sideLength2 + sideLength3;
        return p;
    }
}
