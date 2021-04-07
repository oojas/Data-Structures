package LinkedList;

public class CircularLinkedList {
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
    void add(int data)
    {
         node toAdd=new node(data);
        if(isEmpty())
        {
            head=toAdd;
            head.next=head;
        }
        else
        {
            node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=toAdd;
         
            toAdd.next=head;
           
        }
    }
    void print()
    {
        if(isEmpty())
        {
            System.err.println("Empty List");
        }
        else
        {   System.out.print(head.data+" ");
            node temp=head.next;
            while(temp!=head)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
           // System.out.print(temp.data+" ");
        }
    }
    public static void main(String s[])
    {
        CircularLinkedList obj=new CircularLinkedList();
        obj.add(10);
        obj.add(11);
        obj.add(12);
        obj.add(13);
        obj.print();
    }
}
