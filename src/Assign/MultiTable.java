package Assign;

public class MultiTable {
    int result;
    public void table(int x)
    {
        System.out.println("Table of "+x );
        for(int i=1;i<=10;i++)
        {
            result=x *i;
            System.out.println(x+"*"+i+"="+result);
        }
        
    }
}
