package Functions;

public class call_by_value 
{
    static void swap(int i, int j)//formal arguments
    {
        int k = i;
        i = j;
        j = k;
        System.out.println(i);
        System.out.println(j);
    }
    
    public static void main(String[] args) 
    {
        int a=10, b=20;//actual arguments
        System.out.println("Before swap a is "+ a +" and b is "+ b);
        swap(a,b);
        System.out.println("After swap a is "+ a +" and b is "+ b);
    }
}
//changes made in formal arguments are NOT Reflected in actual arguments...