/*  CONSTRUCTOR
~it is automatically called at the time of creation of object
~no return type
~same name as of class
*/
package Constructor;

public class demo1 
{
    int a, b;
    
    //default constructor
//    demo1()
//    {
//        
//    }
    
    //np constructor
//    demo1()
//    {
//       a = 10;
//       b = 20;
//    }
    
    //p constructor
    demo1(int i, int j)
    {
       a = i;
       b = j;
    }
    
    void display()
    {
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);
    }
}