package Array_2D;

import java.util.*;

public class demo1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //declaration
        int a[][] = new int[3][3];
        int i,j, l=a.length;
        
        //input
        System.out.println("Enter 3x3 Matrix");
        for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        //printing
       for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}