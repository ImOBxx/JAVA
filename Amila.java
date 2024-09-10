
class Animal
{
    void move()
    {
        System.out.println("Animal Is Running.");
    }
}

class Cheetah extends Animal
{
    @Override
    void move()
    {
         System.out.println("Cheetah Is Running.");
    }
}

public class Amila {
    public static void main(String[] args) {
        Animal ob = new Animal();
        Cheetah o = new Cheetah();
        o.move();
        ob.move();
        
    }   
}
