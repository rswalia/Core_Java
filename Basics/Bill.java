package Basics;

public class Bill {
    public static void main(String[] args) {
        int n = 375;
        double bill = 0;
        double mr = 99;
        if(n<=100)
        {
            bill = 0;
        }
        else if(n<=200)
        {
            bill = (n-100)*0.40;
        }
        else if(n<=300)
        {
            bill = (100)*0.40 + (n-200)*0.80;
        }
        else
        {
            bill = (100)*0.40 + (100)*0.80 + (n-300)*1.20;
        }
//        bill = bill + mr;
        System.out.println("Bill amount = "+ (bill+mr));
    }
}
