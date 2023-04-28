package Strings;

public class Q5_String_Pallindrome 
{
    public static void main(String[] args) 
    {
        String s = "madam";
        
        System.out.println(isPallindrome(s));
    }
    
    static boolean isPallindrome(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        
        sb.reverse();
        
        return s.equals(sb.toString());
    }
}