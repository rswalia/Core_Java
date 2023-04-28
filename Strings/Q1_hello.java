package Strings;

import java.util.*;

public class Q1_hello
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        
        int n = s.length();
        
        for(int i=1; i<=n; i++)
        {
            System.out.println(s.substring(0,i));
        }
    }
}