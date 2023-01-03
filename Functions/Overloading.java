//when two or more functions have same name but different arguments ---> Method Overloading
///done at Compile time
package Functions;

import java.util.*;

public class Overloading 
{
    static void fun(int a)
    {
        System.out.println(a);
    }
    
    static void fun(int i, int j)
    {
        System.out.println(i+j);
    }
    
    static void fun(String s)
    {
        System.out.println(s);
    }
    
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
//        System.out.println(Arrays.sort(v));
    }
    
    public static void main(String[] args) 
    {
        //different arguments
        fun(5);
        fun(3,4);
        fun("Rohit");
        fun(5,3,1,7,6,2,10,9,4,8);
    }
}
