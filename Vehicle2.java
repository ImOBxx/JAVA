
class Vehicle
{
    void drive()
    {
        System.out.println("Car's Driving");
    }
}

class Car extends Vehicle{
    
    @Override
    void drive()
    {
        System.out.println("Repairing A Car");
    }
}

public class Vehicle2 {
    public static void main(String[] args) {
        Vehicle ox = new Vehicle();
        Car o = new Car();
        o.drive();
        ox.drive();
        
    }
}
