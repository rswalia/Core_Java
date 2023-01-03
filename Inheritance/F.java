package Inheritance;

public class F extends E
{
    int c;
    
    F(int p, int q, int r)
    {
        super(p,q);//calls constructor of Parent(E)
        c = r;
    }
    
    void display()
    {
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        System.out.println("c is "+ c);
    }
}