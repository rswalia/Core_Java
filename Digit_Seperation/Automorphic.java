package Digit_Seperation;

import java.util.*;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt(); // 25
        int sq = n*n; // 625
        int r;
        int count = 0;
        int orig = n;
        
        while(n!=0) //count
        {
            r = n%10;
            count++;
            n = n/10;
        }
        
        if(sq%Math.pow(10, count) == orig)
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("not Automorphic");
        }
    }
}
