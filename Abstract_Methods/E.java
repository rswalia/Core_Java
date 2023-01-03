package Abstract_Methods;

public  class E extends D
{
    @Override
    void go() 
    {
        System.out.println("go defined in C");
    }
    
    @Override
    void display() 
    {
        System.out.println("display defined in D");
    }

    
}