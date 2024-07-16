package Assign;

public class Child2 extends  InheritanceChild1
{
    protected int multi(int x,int y)
    {
        return x*y;
    }

    @Override
    public int add(int x, int y, int z)
    {
        return x+y-z;

    }

}
