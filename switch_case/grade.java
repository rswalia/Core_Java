package switch_case;

//int switch
import java.util.*;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        switch(n)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Average");
                break;
            case 6:
            case 7:
                System.out.println("Good");
                break;
            case 8:
            case 9:
                System.out.println("Very Good");
                break;
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
