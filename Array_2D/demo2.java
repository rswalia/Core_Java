package Array_2D;

public class demo2 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int l = a.length;
        
        System.out.println(a.length);//no. of rows
        
        System.out.println(a[0].length); //no. of columns in row 1
        System.out.println(a[1].length);
        System.out.println(a[2].length);
        
        //printing
       for(int i=0; i<l; i++)
        {
            for(int j=0; j<l; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}