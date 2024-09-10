class Shape 
{
      public double getArea() {
         return 0.0;
      }
}

class Rectangle extends Shape {
       private double length;
       private double width;

       public Rectangle (double length, double width)
       {
          this.length = length;
          this.width = width;
       }

       @Override
       public double getArea()
       {
          return length * width;
       }
}

public class Shapes {
   public static void main(String[] args) {
         Shape o = new Shape();
         Rectangle ob = new Rectangle(3.0, 10.0);

         double area = ob.getArea();
         System.out.println("Area Of The Rectangle is: " + area);



   }    
}
