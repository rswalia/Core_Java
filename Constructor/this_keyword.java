package Constructor;

public class this_keyword 
{
    int a; //instance variable
    
    void test()
    {
        int a; //local variable
        
        this.a = 10; //instance
        a = 20; //local
        
        System.out.println("Instance variable (this.a) = "+ this.a);
        System.out.println("local variable = "+ a);
    }
    
    //Testing
    public static void main(String[] args) 
    {
        this_keyword obj = new this_keyword();
        obj.test();
    }
}