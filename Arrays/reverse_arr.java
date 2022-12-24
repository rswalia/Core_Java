package Arrays;

import java.util.*;

public class reverse_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[10];
        int l = a.length;
        int i,t;
        
        //input
        for(i=0; i<l; i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(i=0; i<(l/2); i++)
        {
            t = a[i];
            a[i] = a[9-i];
            a[9-i] = t;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
