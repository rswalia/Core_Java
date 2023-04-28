package HackerRank;

import java.util.Scanner;

public class demo1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        
        if(n%2==0) // Even
        {
            if(n>=2 && n<=5)
            {
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }
        else // Odd
        {
            System.out.println("Weird");
        }
    }
}