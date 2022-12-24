package Digit_Seperation;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        int r;
        int temp = 0;
        int orig = n;
        
        while(n!=0)
        {
            r = n%10;
            temp = temp + (r*r*r);
            n = n/10;
        }
        
        if(orig == temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("not Armstrong");
        }
    }
}