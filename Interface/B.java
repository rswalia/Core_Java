package Interface;

public class B implements A
{
    @Override
    public void go() 
    {
        System.out.println("go in A");
    }

    @Override
    public void hello() 
    {
        System.out.println("hello in A");
    }
    
}