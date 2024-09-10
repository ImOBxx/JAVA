
class Vehicle
{
   void SpeedUp()
   {
       System.out.println("Vehicles Are Faster");
   }
}

class Car extends Vehicle
{
    @Override
   void SpeedUp()
   {
    System.out.println("Cars Are Vehicles");
   }
}


class Bicycle extends Vehicle
{
    @Override
    void SpeedUp()
    {
       System.out.println("Bicycle Are Slow");
    }

}

public class Vehicle12 {
    public static void main(String[] args) {
        Vehicle o = new Vehicle();
        Car a = new Car();
        Bicycle b = new Bicycle();

        o.SpeedUp();
        a.SpeedUp();
        b.SpeedUp();
    }
}
