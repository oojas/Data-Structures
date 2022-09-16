public class cycleDetection {
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }
    }
    node head;
    void add(int data){
       node curr=new node(data);
       if(isEmpty()){
        head=curr;
        return;
       }
       node temp=head;
       while(temp.next!=null)
       {
        temp=temp.next;
       }
       temp.next=curr;
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
    boolean isEmpty(){
        return head==null;
    }
    boolean detect(){
        if(isEmpty())return false;
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
            
        }
        return false;
    }
    void detectAndDelete(){
        if(isEmpty())return;
        node slow=head;
        node fast=head;
        while(fast!=null&& fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)break;
        }
        if(slow!=fast)return;
        slow=head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
            if(slow==fast)break;
        }
        fast.next=null;
    }
    void deleteNode(){
        if(isEmpty())return;
        node temp=head.next.next.next;
        temp.data=temp.next.data;
        temp.next=temp.next.next;
    }
    public static void main(String[] args) {
        cycleDetection obj=new cycleDetection();
        for(int i=0 ; i<5; i++)
        {
            obj.add(i);
        }
        obj.print();
        boolean val=obj.detect();
        System.out.println();
        if(val)System.out.println("Yes");
        else System.out.println("No");
        obj.deleteNode();
        System.out.println();
        obj.print();
    }
}
