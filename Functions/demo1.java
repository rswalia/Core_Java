package Functions;

public class demo1 
{
    //no parameter
    static void display()
    {
        System.out.println("Display called");
    }
    
    //one parameter
    static int fact(int n)
    {
        int i, fact=1;
        for(i=n; i>=1; i--)
        {
            fact = fact * i;
        }
        return fact;
    }
    
    //two parameter
    static int sum(int i, int j)
    {
        int k = i + j;
        return k;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("This is line 1");
        display();// no parameter
        System.out.println(fact(5)); // 1 parameter
        System.out.println(sum(28,42)); // 2 parameter
    }
}