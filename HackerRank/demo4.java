package HackerRank;

import java.util.Scanner;

public class demo4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=10; i++)
        {
            int ans = n*i;
            System.out.println(n +" X "+ i +" = "+ ans);
        }
    }
}