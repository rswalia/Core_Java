package Arrays;

public class arr1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int i;
        
        //filling
        for(i=0; i<=4; i++)
        {
            a[i] = 100+i;
        }
        
        //printing
        for(i=0; i<=4; i++)
        {
            System.out.print(a[i] + " ");
        }
        
    }
}