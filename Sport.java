

class Sports
{
    void play()
    {
        System.out.println("Playing Sports");
    }
}

class Football extends Sports
{
    @Override
    void play()
    {
        System.out.println("Playing Sports");
    }

}

class Basketball extends Sports
{
    @Override
   void play()
   {
         System.out.println("Playing Sports");
   }
}

class Rugby extends Sports
{
    @Override
    void play()
    {
        System.out.println("Playing Sports");
    }

}

public class Sport {
    public static void main(String[] args) {
        Sports a = new Sports();
        Football b = new Football();
        Basketball c = new Basketball();
        Rugby d = new Rugby();

        a.play();
        b.play();
        c.play();
        d.play();
    }
}
