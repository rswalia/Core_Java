package Basics;

import java.util.Scanner;

public class Prime
{
    static boolean isPrime(int n)
    {
        boolean flag = true;
        
        if(n==0 || n==1)
            return false;
        else
        {
            for(int i=2; i<=n/2; i++)
            {
                if(n%i==0)
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
                return true;
            else
                return false;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        if(isPrime(n))
            System.out.println("Yesss!!! it is Prime number");
        else
            System.out.println("Not a prime a number");
    }
}    