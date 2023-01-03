package Functions;

import java.util.Arrays;

public class call_by_reference 
{
    static void change(int a[])
    {
        a[0] = 100;
    }
    
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4,5};
        change(a);
        System.out.println(Arrays.toString(a));
    }
}
//changes made in formal arguments are Reflected in actual arguments...