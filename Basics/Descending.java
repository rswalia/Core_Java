package Basics;

public class Descending {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=4;
        
        if(a>b && a>c) //Max = a
        {
            if(b>c)
            {
                System.out.println(a+">"+b+">"+c);
            }
            else
            {
                System.out.println(a+">"+c+">"+b);
            }
        }
        
        else if(b>a && b>c) //Max = b
        {
            if(a>c)
            {
                System.out.println(b+">"+a+">"+c);
            }
            else
            {
                System.out.println(b+">"+c+">"+a);
            }
        }
        
        else //Max = c
        {
            if(a>b)
            {
                System.out.println(c+">"+a+">"+b);
            }
            else
            {
                System.out.println(c+">"+b+">"+a);
            }
        }
    }
}
