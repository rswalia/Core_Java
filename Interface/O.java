package Interface;

public class O extends M implements N
{
    @Override
    public void go() 
    {
        System.out.println("go in N");
    }
    
    public static void main(String[] args) 
    {
        O obj = new O();
        obj.go();
        obj.hello();
        obj.test();
    }
}