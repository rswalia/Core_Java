//1! + 2! + 3! + .... + 10! = ?
package Functions;

public class factorial_sum 
{
    int fact(int n)
    {
        int i, fact=1;
        
        for(i=n; i>=1; i--)
        {
            fact = fact * i;
        }
        
        return fact;
    }
    
    public static void main(String[] args) 
    {
        int i, sum=0;
        
        factorial_sum obj = new factorial_sum();
        
        for(i=1; i<=10; i++)
        {
            sum = sum + obj.fact(i);
        }
        
        System.out.println(sum);
    }
}