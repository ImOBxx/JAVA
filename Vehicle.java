
class Vehicle4
{
   void startEngine()
   {
         System.out.println("Vehicle Engine Starts");
   }
   void stopEngine()
   {
          System.out.println("Vehicle Engine Stops");
   }
}

class Car extends Vehicle4
{
    @Override
    void startEngine()
    {
        System.out.println("Car Engine Starts");
    }
    @Override
    void stopEngine()
    {
        System.out.println("Car Engine Stops");
    }
}

class Motorcycle extends Vehicle4
{
    @Override
    void startEngine()
   {
        System.out.println("Motorcycle Engine Starts");
   }
   @Override
   void stopEngine()
   {
        System.out.println("Motorcycle Engine Stops");
   }
}  

class Vehicle {
    public static void main(String[] args) {
        Vehicle4 car = new Car();
        Vehicle4 motor = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        motor.startEngine();
        motor.stopEngine();


    }
}