
abstract class Bird
{ 
    public abstract void fly();  
}

class Eagle extends Bird
{
    @Override
    public void fly()
    {
        System.out.println("Eagle Glides");
    }
}

class Penguin extends Bird
{
    @Override
    public void fly()
    {
       System.out.println("Penguins Take Semi - Flights");
    }
}

public class Birdssss {
    public static void main(String[] args) {
        Bird eag = new Eagle();
        Bird pen = new Penguin();

        eag.fly();
        pen.fly();
    }
}
