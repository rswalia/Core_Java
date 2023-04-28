package Strings;

public class Q2_Count_Vowels
{
    public static void main(String[] args) 
    {
        String s = "HELLO WORLD";
        
        int n = s.length();
        int count = 0;
        
        for(int i=0; i<n; i++)
        {
            char ch = s.charAt(i);
            switch(ch)
            {
                case 'a': case 'e': case 'i' : case 'o' : case 'u' :
                case 'A': case 'E': case 'I' : case 'O' : case 'U':
//                    System.out.print(ch+" ");
                    count++;
            }
        }
        
        System.out.println("\nvowels = "+count);
    }
}