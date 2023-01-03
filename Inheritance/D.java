package Inheritance;

public class D extends C
{
    int c;
    
    D()
    {
//        super(); //hiden class in NP const
        c = 30;
    }
    
    void display()
    {
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        System.out.println("c is "+ c);
    }
}