

public class insertsortlink {
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;

        }
    }
        node head;
        void insert(int data)
        {
            node curr=new node(data);
            if(isEmpty())
            {
                head=curr;
                head.next=head;
                head.prev=head;    
            }
            node temp=head;
            while(temp.next.data<=curr.data)
            {
                temp=temp.next;
            }
            curr.next=temp.next;
          temp.next.prev=curr;
          temp.next=curr;
          curr.prev=curr;
        }
        void add(int data)
        {
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
            curr.prev=temp;
            curr.next=head;
            head.prev=curr;
        }
        boolean isEmpty(){return head==null;}
        void print(){
            if(isEmpty())return;
            node temp=head.next;
            System.out.print(head.data+" ");
            while(temp!=head)
            {
        
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    
    public static void main(String[] args) {
        insertsortlink obj=new insertsortlink();
        obj.add(1);
        obj.add(2);
        obj.add(4);
        obj.add(5);
        obj.print();
        System.out.println();
        obj.insert(3);
        obj.print();
        obj.add(6);
        System.out.println();
        obj.print();
    }
}
