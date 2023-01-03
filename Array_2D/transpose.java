package Array_2D;

public class transpose 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int i,j, l=a.length;
        int b[][] = new int[l][l];
        
        for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                b[i][j] = a[j][i];
            }
        }
        
        //print b
        for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}