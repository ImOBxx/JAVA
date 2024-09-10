
class Animals 
{
     void makeSound()
     {
        System.out.println("Dog Bark.");
     }
}

class Cat extends Animals{

    
    void makeSound()
    {
        System.out.println("Cat Bark.");
    }
}

public class Animal {
   public static void main(String[] args) {
        Cat obj = new Cat();
        obj.makeSound();
        obj.makeSound();
        obj.makeSound();
   }
}