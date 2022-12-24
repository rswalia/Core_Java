package Digit_Seperation;

import java.util.*;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        int r;
        int rev = 0;
        int orig = n;
        
        while(n!=0)
        {
            r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        
        if(orig == rev)
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("not a Pallindrome");
        }
    }
}
