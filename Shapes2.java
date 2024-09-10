class Shapes {
    double calcarea() {
        return 0.0;
    }
}

class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcarea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcarea() {
        return length * width;
    }
}

class Triangle extends Shapes {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcarea() {
        return 0.5 * base * height;
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Circle a = new Circle(4);
        Rectangle b = new Rectangle(3, 4);
        Triangle c = new Triangle(5, 6);

        System.out.println("Area of Circle: " + a.calcarea());
        System.out.println("Area of Rectangle: " + b.calcarea());
        System.out.println("Area of Triangle: " + c.calcarea());
    }
}
