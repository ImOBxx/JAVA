
class PolyA
{
   void Sound()
   {
    System.out.println("Animals Make Sounds");
   }
}

class Bird extends PolyA
{
    @Override
   void Sound()
   {
    System.out.println("Birds Chirp");
   }
}

class Cat extends PolyA
{ 
    @Override
    void Sound()
    {
      System.out.println("Cat Meows");
    }

}

public class PolyAnimal {
    public static void main(String[] args) {
        PolyA a = new PolyA();
        Bird b = new Bird();
        Cat c = new Cat();

        a.Sound();
        b.Sound();
        c.Sound();
    }
}
