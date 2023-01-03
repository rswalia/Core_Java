package Array_2D;

public class upper_half 
{
    public static void main(String[] args)
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int i,j, l=a.length;
        
        for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                if(i<=j)
                {
                    System.out.print(a[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}