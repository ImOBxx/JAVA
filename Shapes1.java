class Shapes{

    protected double radius;

    public Shapes(double radius)
    {
        this.radius = radius;
    }

    double getPeri()
    {
        return 0.0;
    }

    double area()
    {
        return 0.0;
    }

}

class Circle extends Shapes
{
    public Circle(double radius)
    {
        super(radius);
    }
    @Override
    double getPeri()
    {
        return 3.14 * radius * 2;
    }

    @Override
    double area()
    {
        return 3.14 * radius * radius;
    }
}

public class Shapes1 {
   public static void main(String[] args) {
       Circle o = new Circle(4);
       System.out.println("Perimeter Of The Circle: " + o.getPeri());
       System.out.println("Area Of The Circle: " + o.area());

       Circle o2 = new Circle(7);
       System.out.println("Perimeter Of The Circle: " + o2.getPeri());
       System.out.println("Area Of The Circle: " + o2.area());



        
   }   
}
