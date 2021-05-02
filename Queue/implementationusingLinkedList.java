
public class implementationusingLinkedList {
    class node
    {
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
        void enque(int data)
        {
            node toAdd=new node(data);
            if(isEmpty())
            {
                head=toAdd;
            }
            else
            {
                node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=toAdd;
                toAdd.next=null;
            }
        }
        void print()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
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
        int deque(int pos)
        {
            if(isEmpty())
            {
                if(pos==1)
                {
                    int dat=head.data;

                    head=null;
                    return dat;
                }
                return -1;

            }
            node temp=head;
            int count=1;
            while(count!=pos-1)
            {
                temp=temp.next;
                count++;
            }
            int data=temp.next.data;
            temp.next=temp.next.next;
            return data;
        }
    
 public static void main(String s[])
 {
  implementationusingLinkedList obj=new implementationusingLinkedList();
  obj.enque(12);
  obj.enque(13);
  obj.enque(14);
  obj.deque(2);
  obj.print();
 }   
}
