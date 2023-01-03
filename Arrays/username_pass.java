package Arrays;

import java.util.*;

public class username_pass 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String u[] = {"abc", "def", "mno", "xyz"};
        String p[] = {"111", "222", "333", "444"};
        
        System.out.println("Enter username");
        String user = sc.nextLine();
        
        System.out.println("Enter password");
        String pass = sc.nextLine();
        
        boolean flag = false;
        
        for(int i=0; i<u.length; i++)
        {
            if(user.equals(u[i]) && pass.equals(p[i]))
            {
                flag = true;
                break;
            }
        }
        
        if(flag)
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Login failed");
        }
    }
}