package Interface;
public class R implements P,Q
{

    @Override
    public void go() 
    {
        System.out.println("go in P");
    }

    @Override
    public void hello() 
    {
        System.out.println("hello in P,Q");
    }

    @Override
    public void display() 
    {
        System.out.println("display in Q");
    }
    
}