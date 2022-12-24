package switch_case;

import java.util.*;

public class switch_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter short form of college");
        String s = sc.nextLine();
        
        s = s.toLowerCase();
        
        switch(s)
        {
            case "gndu":
                System.out.println("Guru Nanak Dev University");
                break;
            case "lpu":
                System.out.println("Lovely Professional University");
                break;
            case "cu":
                System.out.println("Chandigarh University");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
