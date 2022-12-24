package Arrays;

import java.util.*;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        int i;
        
        //input
        System.out.println("Enter 5 numbers");
        for(i=0; i<=4; i++)
        {
            a[i] = sc.nextInt();
        }
        
        //printing
        for(i=0; i<=4; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
