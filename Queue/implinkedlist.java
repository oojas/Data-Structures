public class implinkedlist {
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    node head;
    void enqueue(int data)
    {
     node curr=new node(data);
     if(isEmpty())
     {
        head=curr;
        return;
     }
     node temp=head;
     while(temp.next!=null)
     {
        temp=temp.next;

     }
     temp.next=curr;
    }

    boolean isEmpty()
    {
        return head==null;
    }
    void dequeue()
    {
        if(isEmpty())return;
        head=head.next;
    }
    void print()
    {
        if(isEmpty())return;
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    int getFront()
    {
        return head.data;
    }
    int getRear()
    {
        if(isEmpty())return-1;
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        implinkedlist obj=new implinkedlist();
        for(int i=0 ; i<10 ; i++)
        {
            obj.enqueue(i);
        }
        obj.print();
        obj.dequeue();
        obj.print();
    System.out.println(obj.getFront());
    System.out.println(obj.getRear());
    }
}
