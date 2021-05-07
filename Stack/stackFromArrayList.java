

import java.util.ArrayList;
import java.util.Scanner;

public class stackFromArrayList {
     int top;
    ArrayList<Integer> list=new ArrayList<Integer>();
    stackFromArrayList()
    {
        top=-1;
    }
    void push(int element)
    {
        top++;
        list.add(element);
    }
    int pop()
    {
        int res=list.remove(top);
        top--;
        return res;
    }
    int length()
    {
        return top+1;
    }
    void print()
    {
        for(int i=0 ; i<list.size() ; i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String s[])
    {
        stackFromArrayList stack=new stackFromArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n=sc.nextInt();
        System.out.println("Enter the elements of stack");
        for(int i=0 ; i<n ; i++)
        {
            stack.push(sc.nextInt());
        }
        sc.close();
        System.out.println("The element popped is " +stack.pop() );
        System.out.println("The elements after the pop are");
        stack.print();
    }
}
