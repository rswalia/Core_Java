package Constructor;

public class temp_instance 
{
    int a;
    int b;

    temp_instance() 
    {
        a = 10;
        b = 20;
    }
    
    void display()
    {
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
    }
    
    public static void main(String[] args) 
    {
        new temp_instance().display();
    }
    
}