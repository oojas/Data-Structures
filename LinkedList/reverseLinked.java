public class reverseLinked {
    class node{
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }}
        node head;
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
        }
        boolean isEmpty(){
            return head==null;
        }
        void print()
        {
            if(isEmpty())return;
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void reverse(){
            if(isEmpty())return;
            if(head.next==null)return;
             node curr=head;
             node prev=null;
             while(curr!=null)
             {
                node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
             }
             head=prev;
        }
        void removeDuplicate(){
            if(isEmpty())return;
            node curr=head.next;
            node prev=head;
            while(prev.next!=null){
                if(prev.data==curr.data){
                   prev.next=curr.next;
                   curr=prev.next;                                                                                                                                                                                                                                                                                                                                            
                }
                
       
                curr=curr.next;
                prev=prev.next;
            }
        }
    
    public static void main(String[] args) {
        reverseLinked obj=new reverseLinked();
       obj.add(1);
       obj.add(1);
       obj.add(2);
       obj.add(3);
       obj.add(3);
       obj.add(4);
       obj.add(4);
       obj.add(5);  
        obj.print();
        // obj.reverse();
        // System.out.println();
        // obj.print();
        System.out.println();
        obj.removeDuplicate();
        obj.print();
    }
}
