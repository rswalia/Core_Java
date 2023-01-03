package Arrays;

import java.util.Scanner;

public class sum {   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        //declaration
        int a[] = new int[3];
        
        //input
        System.out.println("Enter three numbers");
        for(int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<a.length; i++)
        {
            sum = sum + a[i];
        }
        
        System.out.println("Sum = "+ sum);
    }
}