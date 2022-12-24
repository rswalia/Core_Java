package Loops;

public class do_while {
    public static void main(String[] args) {
        int i = 1;
        
//        while(i<=10)
//        {
//            System.out.print(i +" ");
//            i++;
//        }

//        do
//        {
//            System.out.print(i +" ");
//            i++;
//        }
//        while(i<=10);

        while(true)
        {
            System.out.print(i +" ");
            if(i==5)
            {
                break; //loop stops when condition is false or break
            }
            i++;
        }
    }
}
