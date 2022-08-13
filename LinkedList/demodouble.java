public class demodouble {
    class node{
        int data;
        node prev;
        node next;
        node(int data){
            this.data=data;
        }

    }
    void add(int data){
        node curr=new node(data);
        if(isEmpty())
        {
            head=curr;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=curr;
        curr.prev=temp;
        curr.next=null;
    }
    void print(){
        if(isEmpty())return;
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void insertBegin(int data){
        node curr=new node(data);
        if(isEmpty())
        {
            head=curr;
            return;
        }
      curr.next=head;
      head.prev=curr;
      head=curr;
    }
    void insertEnd(int data){
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
        curr.prev=temp;
    }
    void reverse(){
        if(isEmpty())return;
        node temp=head;
        node count=head;
        while(count.next!=null)count=count.next;
        while(temp!=count)
        {
            int v=temp.data;
            temp.data=count.data;
            count.data=v;
            temp=temp.next;
            count=count.prev;
        }
    }
    boolean isEmpty(){return head==null;}
    node head;
    public static void main(String[] args) {
        demodouble obj=new demodouble();
        for(int i=1 ; i<=7 ; i++)
        {
            obj.add(i);
        }
        obj.print();
        obj.insertBegin(8);
        System.out.println();
        obj.print();
        obj.insertEnd(9);
        System.out.println();
        obj.print();
        obj.reverse();
        System.out.println();
        obj.print();
    }
}
