//0 1 1 2 3 5 8 ....
package Loops;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int c;
        
        for(int i=1; i<=n; i++)
        {
            System.out.print(a +" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
