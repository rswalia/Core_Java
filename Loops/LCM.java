package Loops;

import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lcm = 0;
        int i;
        
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(i=1; i<=a*b; i++)
        {
            if(i%a==0 && i%b==0)
            {
                lcm = i;
                break;
            }
        }
        
        System.out.println("LCM = "+ lcm);
        System.out.println("loop runs "+i+" times");
    }
}
