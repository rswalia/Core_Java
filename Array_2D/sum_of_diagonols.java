package Array_2D;

public class sum_of_diagonols 
{
    public static void main(String[] args)
    {
        int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int i,j, l=a.length;
        int sum1=0 , sum2=0 , sum=0;
        
        for(i=0; i<l; i++)
        {
            for(j=0; j<l; j++)
            {
                //left diagonol
                if(i==j)
                {
                    sum1 = sum1 + a[i][j];
                }
                //right diagonol
                if(i+j == 2)
                {
                    sum2 = sum2 + a[i][j];
                }
            }
        }
        
        sum = sum1 + sum2;
        
        System.out.println(sum);
        
    }
}