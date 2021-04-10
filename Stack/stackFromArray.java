package Stack;

import java.util.Scanner;

public class stackFromArray {
    int cap;
    int a[];
    int top;
    stackFromArray(int c)
    {
       cap=c;
       top=-1;
       a=new int[cap];
    }
    void push(int element)
    {
      top++;
      a[top]=element;
    }
    int pop(){
    if(top==-1)
    {
        return -1;
    }
    else
    {
        int res=a[top];
        top--;
        return res;
    }
      
    }
    int length()
    { 
          return top+1;
    }
    void print()
    {
        for(int i=0; i<length() ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String s[])
    {
        stackFromArray stack=new stackFromArray(10);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of stack");
        for(int i=0 ; i<10 ; i++)
        {
            stack.push(sc.nextInt());
        }
        sc.close();
        System.out.println("The element popped is " +stack.pop() );
        System.out.println("The elements after the pop are");
        stack.print();
    }
}
