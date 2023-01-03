package static_keyword;

public class test_demo3 
{
    public static void main(String[] args) 
    {
        demo3 obj1 = new demo3();
        obj1.a = 5;
        obj1.b = 10;
//        obj1.c = 12;
        demo3.c = 12;
        obj1.test();
        
        demo3 obj2 = new demo3();
        obj2.test();
        
        demo3.c = 30;
        demo3.display();
        
    }
}
//non static ---> both static & non static
//static ---> static
//static ---> make object ---> non static