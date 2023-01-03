package Functions;

import java.util.Arrays;

public class copy_object_reference 
{
    public static void main(String[] args) 
    {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7}; //destroyed by garbage collection
        
        b = a;
        b[0] = 10;
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
    }
}