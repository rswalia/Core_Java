//1 -4 7 -10 13 -16.....-40
package Digit_Seperation;

public class print {
    public static void main(String[] args) {
        int sign = 1;    
            
        for(int i=1; i<=40; i=i+3)
        {
            System.out.print((i*sign)+" ");
            sign = - sign;
        }
    }
}
