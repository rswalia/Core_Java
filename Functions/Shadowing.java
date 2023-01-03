package Functions;

public class Shadowing 
{
    static int x = 10; //  instance variable  
    
    public static void main(String[] args) 
    {
        System.out.println(x); // 10
        int x = 90; // local variable, shadows the instance variable
        System.out.println(x); // 90
        fun();
    }
    
    static void fun()
    {
        System.out.println(x); // 10
    }
}