public class dem {
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
        node val=new  node(data);
        if(isEmpty()){
            head=val;
            return ;}
            node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=val;
    }
    void print()
    {
        if(isEmpty())return ;
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void pairswap()
    {
        if(isEmpty())return ;
        node prev=head;
        node curr=head.next.next;
        head=head.next;
        head.next=prev;
        while(curr!=null && curr.next!=null)
        {
            node next=curr.next.next;
            prev.next=curr.next;
            curr.next.next=curr;
            curr.next=next;
            prev=curr;
            curr=next;
        }
        prev.next=curr;
        
    }
    public static void main(String[] args) {
        dem obj=new dem();
        for(int i=0 ; i<5 ; i++)
        {
            obj.add(i);
        }
        obj.print();
        obj.pairswap();
        obj.print();
    }
}
