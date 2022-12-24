package Basics;

//swap two numbers
import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine(); //String
//        char ch = sc.nextLine().charAt(0); //character
        
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        
        c=a;
        a=b;
        b=c;
        
        System.out.println("After Swap");
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
