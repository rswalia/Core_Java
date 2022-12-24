package switch_case;

//char switch
import java.util.*;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter character");
        char ch = sc.nextLine().charAt(0);
        
        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
