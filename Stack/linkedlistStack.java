

import java.util.Scanner;

public class linkedlistStack {
   class node{
       int data;
       node next;
       node(int data)
       {
           this.data=data;
       }

   }   
   node head;
   boolean isEmpty()
   {
       return head==null;
   }
   void push(int data)
   {
       node toAdd=new node(data);
       if(isEmpty())
       {
           head=toAdd;
       }
       node temp=head;
       while(temp.next!=null)
       {
           temp=temp.next;
       }
       temp.next=toAdd;
       toAdd.next=null;
   } 
   int pop()
   {
       if(isEmpty())
       {
           return -1;
       }
       else if(head.next==null)
       {
           int res=head.data;
           head=null;
           return res;
       }
       else
       {
           node temp=head;
           while(temp.next.next!=null)
           {
               temp=temp.next;
           }
           int t=temp.next.data;
           temp.next=null;
           return t;
       }
   }
   int length()
   {
       if(isEmpty())
       {
           return 0;
       }
       else
       {
           node temp=head;
        int count=1; 
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
       }
     
   }
   void print()
   {
       if(isEmpty())
       {
           System.err.println("Empty List");
       }
       else
       {
           node temp=head;
           while(temp!=null)
           {
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
       }
   }
   public static void main(String sp[])
   {
       linkedlistStack stack=new linkedlistStack();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the stack");
       int n=sc.nextInt();
       System.out.println("Enter the elements in stack");
       for(int i=0 ; i<n ; i++)
       {
           stack.push(sc.nextInt());
       }
       sc.close();
       System.out.println("The popped element is "+ stack.pop());
       System.out.println("The elements after the popping are");
       stack.print();

   }
}
