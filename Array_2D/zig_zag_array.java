package Array_2D;

public class zig_zag_array 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3}, {4,5,6,7}, {8,9}};
        int l = a.length;
        
        System.out.println(a.length);//3
        
        System.out.println(a[0].length); //3
        System.out.println(a[1].length);//4
        System.out.println(a[2].length);//2
        
        //printing
       for(int i=0; i<a.length; i++)
        {
            for(int j=0; j< a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}