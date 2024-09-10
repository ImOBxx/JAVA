class Animal
{
    void eat()
    {
        System.out.println("Animal eats.");
    }
    void sound()
    {
        System.out.println("Animal make a Sound.");
    }
}

class Lion extends Animal
{
    @Override
    void eat()
    {
        System.out.println(" Lion Eats meat.");
    }
    @Override
    void sound()
    {
        System.out.println("Lion roars.");
    }
}

class Tiger extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Tiger eats meat.");
    }
    @Override
    void sound()
    {
        System.out.println("Tiger Growls.");
    }
}

class Panther extends Animal
{
    @Override
    void eat()
    {
        System.out.println("Panther eats meat.");
    }
    @Override
    void sound()
    {
        System.out.println("Panther hisses.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();

        lion.eat();
        lion.sound();

        tiger.eat();
        tiger.sound();

        panther.eat();
        panther.sound();
    }
}
