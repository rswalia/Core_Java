package Arrays;

import java.util.*;

public class Smallest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        int i;
        
        //input
        for(i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        
//        Arrays.sort(a);
//        
//        System.out.println(a[0]);

        int small = a[0];
        
        for(i=0; i<a.length; i++)
        {
           if(a[i] < small){
               small = a[i];
           } 
        }
        
        System.out.println(small);
    }
}
