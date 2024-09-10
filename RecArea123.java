import java.util.Scanner;

class Area {
    double length;
    double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setDim() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length: ");
        this.length = in.nextDouble();
        System.out.println("Enter Breadth: ");
        this.breadth = in.nextDouble();
    }

    public double getArea() {
        return this.length * this.breadth;
    }
}

public class RecArea123 {
    public static void main(String[] args) {
        // Initial values for length and breadth
        Area ar = new Area(0, 0);

        ar.setDim();
        double area = ar.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
