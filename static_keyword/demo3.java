package static_keyword;

public class demo3 
{
    int a, b;
    static int c;
    
    void test()
    {
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
        System.out.println("c is "+ c);
    }
    
    static void display()
    {
//        System.out.println(a);
//        System.out.println(b);
        System.out.println("static c = "+ c);
    }
}