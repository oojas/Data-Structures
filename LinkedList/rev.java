public class rev {
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    node head;
    void add(int data)
    {
        node curr=new node(data);
      if(isEmpty()){head=curr;
        return;}
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=curr;
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
    boolean isEmpty()
    {
        return head==null;
    }
    public static void main(String[] args) {
        rev obj=new rev();
        for(int i=0 ; i<8 ; i++)
        {
            obj.add(i);
        }
        obj.print();
    }
}
