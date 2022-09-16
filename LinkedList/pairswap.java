
public class pairswap {
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    node head;
    boolean isEmpty(){
        return head==null;
    }
    void add(int data)
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
    void print(){
        if(isEmpty())return;
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void swap(){
        if(isEmpty())return;
        if(head.next==null && head.next!=null)return;
    node prev=head;
    node curr=head.next.next;
    head=head.next;
    head.next=prev;
    while(curr!=null && curr.next!=null){
      prev.next=curr.next;
      node next=curr.next.next;
      prev=curr;
      curr.next.next=curr;
      curr=next;
    }
     prev.next=curr;
    }
    public static void main(String[] args) {
        pairswap obj=new pairswap();
        for(int i=1 ; i<=8 ; i++)
        {
            obj.add(i);
        }
        obj.print();
        obj.swap();
        obj.print();
    }
}
