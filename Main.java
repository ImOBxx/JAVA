abstract class Shape2345 {
    public abstract double getArea();
}

class Circle extends Shape2345 {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape2345 {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double getArea() {
        return w * h;
    }
}

class Triangle extends Shape2345 {
    private double l;
    private double h2;

    public Triangle(double l, double h2) {
        this.l = l;
        this.h2 = h2;
    }

    @Override
    public double getArea() {
        return 0.5 * l * h2;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape2345[] shapes = new Shape2345[] {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4)
        };

        for (Shape2345 shape : shapes) {
            System.out.println("The area of the " + shape.getClass().getSimpleName() + " is " + shape.getArea());
        }
    }
}
