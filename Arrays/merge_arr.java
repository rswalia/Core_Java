package Arrays;

import java.util.*;

public class merge_arr {
    public static void main(String[] args) {
        int a[] = {10,9,7,6};
        int b[] = {5,2,12};
        
        int m = a.length;
        int n = b.length;
        
        int c[] = new int[m+n];
        int i;
        
        //copying first array
        for(i=0; i<m; i++)
        {
            c[i] = a[i]; 
        }
        
        //copying second array
        for(i=0; i<n; i++)
        {
            c[i+m] = b[i]; 
        }
        
        //after merging
        System.out.println(Arrays.toString(c));
    }
}
