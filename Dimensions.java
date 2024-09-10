
class Shape
{
    double getArea()
    {
       return 0.0;
    }

    double getPeri()
    {
       return 0.0;
    } 
}

class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
         this.length = length;
         this.width = width; 
    }

    @Override
    double getArea()
    {
       return this.length * this.width;
    }
      
    @Override
    double getPeri()
    {
       return 2 * (this.length + this.width);
    } 

}

class Triangle extends Shape
{
    private double base;
    private double height;

    public Triangle(double base, double height)
    {
         this.base = base;
         this.height = height;
    }
    @Override
    double getArea()
    {
       return 0.5 * this.base * this.height;
    }
    @Override
    double getPeri()
    {
        return this.base / this.height;
    } 
}

class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
         this.radius = radius;
    }
    @Override
    double getArea()
    {
       return 3.14 * this.radius * this.radius;
    }
    @Override
    double getPeri()
    {
       return 2 * 3.14 * this.radius;
    } 
    
}

public class Dimensions {
    public static void main(String[] args) {
    Circle a = new Circle(45);
    Triangle b = new Triangle(67, 45);
    Rectangle c = new Rectangle(34, 23);

    System.out.println("Area Of The Circle: " + a.getArea() );
    System.out.println("Perimeter Of The Circle: " + a.getPeri());

    System.out.println("Area Of The Triangle: " + b.getArea() );
    System.out.println("Perimeter Of The Triangle: " + b.getPeri());

    System.out.println("Area Of The Rectangle: " + c.getArea() );
    System.out.println("Perimeter Of The Rectangle: " + c.getPeri());

    }   
}
