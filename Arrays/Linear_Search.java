package Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int a[] = {12,10,8,20,30,60,7};
        int key = 20;
        int i;
        boolean flag = false;
        
        for(i=0; i<a.length; i++)
        {
            if(a[i] == key)
            {
                flag = true;
                break;
            }
        }
        
        if(flag) {
            System.out.println("Index = " + i);
        } else {
            System.out.println("number not found");
        }
    }
}
