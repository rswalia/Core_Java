package Loops;

import java.util.*;

public class LCM_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lcm = 0;
        int i;
        
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        
        for(i=1; i<=a*b; i++)
        {
            if((max*i)%min==0)
            {
                lcm = (max*i);
                break;
            }
        }
        
        System.out.println("LCM = "+ lcm);
        System.out.println("loop runs "+i+" times");
    }
}
