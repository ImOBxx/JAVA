// Abstract superclass Shape with abstract method draw()
abstract class Shape {
    public abstract void draw();
}

// Subclass Rectangle
class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private int height;

    public Triangle(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Main class to demonstrate the usage
public class Main2 {
    public static void main(String[] args) {
        // Create instances of Rectangle and Triangle
        Shape rectangle = new Rectangle(5, 3);
        Shape triangle = new Triangle(4);

        // Call the draw method on each instance
        System.out.println("Drawing Rectangle:");
        rectangle.draw();
        
        System.out.println("\nDrawing Triangle:");
        triangle.draw();
    }
}

