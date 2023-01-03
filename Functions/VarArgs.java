// variable length arguments (int ...v)
package Functions;

import java.util.*;

public class VarArgs 
{
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
    static void multiple(int a, int b, String ...v)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    
    public static void main(String[] args) 
    {
        fun(1,2,3,4,5);
        multiple(8, 9,"Rohit" ,"Vishal");
    }
}