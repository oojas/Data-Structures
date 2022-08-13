public class democircular {
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }

    }
    node head;
    boolean isEmpty(){return head==null;}
    void add(int data){
        node curr=new node(data);
        if(isEmpty())
        {
            head=curr;
            head.next=head;
            return;
        }
        node temp=head;
        while(temp.next!=head)temp=temp.next;
        temp.next=curr;
        curr.next=head;
    }
    void print(){
        if(isEmpty())return;
        System.out.print(head.data+" ");
        node temp=head.next;
        while(temp!=head)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void insertAtBegin(int data){
        node curr=new node(data);
        if(isEmpty())
        {
            head=curr;
            head.next=head;
            return;
        }
       node temp=head;
       while(temp.next!=head)
       {
        temp=temp.next;
       }
       curr.next=head;
       head=curr;
       temp.next=head;
    }
    void insertAtEnd(int data){
        node curr=new node(data);
        if(isEmpty())
        {
        head=curr;
        head.next=head;
        return;
        }
        node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=curr;
        curr.next=head;

    }
    void deleteHead(){
        if(isEmpty())return;
        node temp=head;
        while(temp.next!=head)temp=temp.next;
        temp.next=head.next;
        head=head.next;
    }
    void deleteFromAPos(int pos)
    {
        if(isEmpty())return;
        node temp=head;
        int count=1;
        while(count!=pos-1)
        {
            temp=temp.next;
            count++;
        }
        
    }
    void findMiddle(){
        if(head==null)return;
        node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.print(slow.data);
    }
    public static void main(String[] args) {
        democircular obj=new democircular();
        for(int i=1 ; i<=6 ; i++)
        {
            obj.add(i);
        }
        obj.print();
        obj.insertAtBegin(10);
        System.out.println();
        obj.print();
        obj.insertAtEnd(11);
        System.out.println();
        obj.print();
        obj.deleteHead();
        System.out.println();
        obj.print();
        System.out.println();
        obj.print();
    }
}
