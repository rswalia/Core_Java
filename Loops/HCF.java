package Loops;

import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int hcf = 0;
        int i;
        
        for(i=1; i<=min; i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf = i;
            }
        }
        
        System.out.println("HCF = "+ hcf);
    }
}
