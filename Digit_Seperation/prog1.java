package Digit_Seperation;

import java.util.*;

public class prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        int r;
        
        while(n!=0)
        {
            r = n%10;
            System.out.println(r);
            n = n/10;
        }
    }
}
