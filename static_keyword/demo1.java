package static_keyword;

public class demo1 
{
    int sum(int i, int j)
    {
        int k = i + j;
        return k;
    }
    
    public static void main(String[] args) 
    {
        int a=10, b=20, c;
//        c = sum(a,b);

        demo1 obj = new demo1();
        c = obj.sum(a, b);
        System.out.println("Sum is "+ c);
    }
}