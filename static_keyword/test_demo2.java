package static_keyword;

public class test_demo2 
{
    public static void main(String[] args) 
    {
        demo2 obj1 = new demo2();
        obj1.test();
        
        demo2 obj2 = new demo2();
        obj2.a = 0;
        obj2.test();
    }
}
//every object has its own copy of its non static members