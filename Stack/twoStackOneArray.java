package Stack;

public class twoStackOneArray {
    int cap;
    int top1;
    int top2;
    int a[];
    twoStackOneArray(int n)
    {
        cap=n;
        top1=-1;
        top2=cap;
        a=new int[cap];

    }
    void push1(int element)
    {
        if(top1<top2-1)
        {
            top1++;
            a[top1]=element;
        }
    
    }
    void push2(int element)
    {
        if(top1<top2-1)
        
        {
            top2--;
            a[top2]=element;
            
            
        }
        
    }
    int pop1()
    {
        if(top1>=0)
        {
            int res=a[top1];
            top1--;
            return res;
        }
        
        else
        return -1;
    }
    int pop2()
    {
        if(top2<cap)
        {
            int res=a[top2];
            top2++;
            return res;
        }
        else
        return -1;
        
    }
    void print()
    {
        for(int i=0 ; i<cap ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String s[])
    {
        twoStackOneArray obj=new twoStackOneArray(6);
        obj.push1(1);
        obj.push2(2);
        obj.push1(3);
        obj.push2(4);
        obj.push1(5);
        obj.push2(6);
        
        obj.print();
    }
}
