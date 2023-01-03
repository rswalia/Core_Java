package Functions;

import java.util.*;

public class string_demo 
{
    //return type = String
    static String greet()
    {
        String s = "Hi ";
        return s;
    }
    
    //String arguments
    static String personalGreet(String a)
    {
        String s = "Happy New Year 2023 ! "+ a;
        return s;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
        
//        String ans = greet() + name;

        String ans = personalGreet("Rohit");
        System.out.println(ans);
    }
}