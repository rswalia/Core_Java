package Functions;

import java.util.*;

public class sum 
{
    static int add(int i, int j)
    {
        int k = i + j;
        return k;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = add(a,b);
        System.out.println(ans);
    }
}