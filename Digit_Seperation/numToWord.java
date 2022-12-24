package Digit_Seperation;

import java.util.*;

public class numToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        int r;
        String ans = " ";
        
        while(n!=0)
        {
            r = n%10;
            
            switch(r)
            {
                case 0:
                    ans = "zero " + ans;
                    break;
                case 1:
                    ans = "one " + ans;
                    break;
                case 2:
                    ans = "two "+ ans;
                    break;
                case 3:
                    ans = "three " + ans;
                    break;
                case 4:
                    ans = "four " + ans;
                    break;
                case 5:
                    ans = "five " + ans;
                    break; 
                case 6:
                    ans = "six " + ans;
                    break;
                case 7:
                    ans = "seven " + ans;
                    break;
                case 8:
                    ans = "eight " + ans;
                    break;
                case 9:
                    ans = "nine " + ans;
                    break;   
            }
            
            n = n/10;
        }
        
        System.out.println(ans);
        
//        String ans = "";
//        ans = 1 + ans; // 1
//        ans = 4 + ans; // 41
//        ans = 6 + ans; // 641
//        
//        System.out.println(ans);
    }
}
