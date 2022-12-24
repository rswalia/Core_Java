package switch_case;

import java.util.*;

public class menu_driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your choice");
        System.out.println("1 for Laptop");
        System.out.println("2 for Desktop");
        
        int n = sc.nextInt();
        int amount = 0;
        double discount = 0;
        
        switch(n)
        {
            case 1:
                System.out.println("Enter amount");
                amount = sc.nextInt();
                if(amount<=30000)
                {
                    discount = 0.10*amount;
                }
                else
                {
                    discount = 0.15*amount;
                }
                break;
                
            case 2:
                System.out.println("Enter amount");
                amount = sc.nextInt();
                if(amount<=25000)
                {
                    discount = 0.15*amount;
                }
                else
                {
                    discount = 0.20*amount;
                }
                break;
                
            default:
                System.out.println("Invalid number");
        }
        
        System.out.println("Discount = "+ discount);
        System.out.println("Net amount = "+ (amount-discount) );
        
    }
}
