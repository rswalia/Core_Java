package Strings;

public class Q3_Count_Words
{
    public static void main(String[] args) 
    {
        String s = "   hello world how are you   ";
        
        s = s.trim();
        
        int n = s.length();
        int space = 0;
        
        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            {
                space++;
            }
        }
        
        int words = space+1;
        
        System.out.println(words);
    }
}