package Arrays;

public class marks_arr {
    public static void main(String[] args) {
        //print who score more than 70%
        int a[] = {63,54,98,92,74};
        int i;
        
//        for(i=0; i<a.length; i++)
//        {
//            if(a[i] > 70)
//            {
//                System.out.print(a[i] +" ");
//            }
//        }

        for(i=0; i<a.length; i++)
        {
            if(a[i] > 90)
            {
                System.out.println("Above 90 = " + a[i]);
            }
            
            else if(a[i] > 80)
            {
                System.out.println("above 80 = " + a[i]);
            }
            
            else if(a[i] > 70)
            {
                System.out.println("above 70 = " + a[i]);
            }
            
//            else
//            {
//                System.out.print("below 70 = " + a[i]);
//            }
        }
        
    }
}
