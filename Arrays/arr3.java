package Arrays;

import java.util.*;

public class arr3 {
    public static void main(String[] args) {
        //shortcut,length,input
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        int i;
        
        //input
        System.out.println("Enter 5 numbers");
        for(i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        
        //print shortcut
        System.out.println(Arrays.toString(a));
    }
}