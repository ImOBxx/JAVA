
abstract class Vehicle
{
    public abstract void startEngine();
} 

class Car extends Vehicle
{
     @Override
     public void startEngine() {
        System.out.println("Starting the car engine with a key or button.");
    }
}

class Motorcycle extends Vehicle
{
   @Override
   public void startEngine() {
    System.out.println("Starting the Motorcycle engine with a key or button.");
}
}

class Bicycle extends Vehicle
{
   @Override
   public void startEngine() {
    System.out.println("Starting the Cycle engine with a key or button.");
}
}



public class Van {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motor = new Motorcycle();
        Vehicle bic = new Bicycle();

        car.startEngine();
        motor.startEngine();
        bic.startEngine();
    }
}
