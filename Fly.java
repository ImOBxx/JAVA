
abstract class Bird
{
    public abstract void sing();
}

class Sparrow extends Bird
{
   @Override
   public void sing()
   {
      System.out.println("Sparrow Sings");
   }
}

class Parrot extends Bird
{
    @Override
   public void sing()
   {
      System.out.println("Parrot Sings");
   }
}

public class Fly {
    public static void main(String[] args) {
        Bird sp = new Sparrow();
        Bird pa = new Parrot();

        sp.sing();
        pa.sing();
    }
}
