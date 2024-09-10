abstract class Parent {
    public abstract void message();
}

class Son extends Parent
{
    @Override
    public void message()
    {
         System.out.println("This Is The First SubClass");
    }
}

class Daughter extends Parent
{
      @Override
      public void message()
      {
          System.out.println("This Is the Second SubClass");
      }
}

public class ParentClass {
    public static void main(String[] args) {
        Parent son = new Son();
        Parent daugh = new Daughter();

        son.message();
        daugh.message();
    }
}
