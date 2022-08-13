public class demo {
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
            node temp=new node(data);
            node curr=head;
            if(isEmpty())
            {
                head=temp;
               
            }
         else{   while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=temp;
            temp.next=null;
        }}
        void insertBegin(int data)
        {
            node curr=new node(data);
            if(isEmpty())
            {head=curr;
                return;}
                curr.next=head;
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
            curr.next=null;
        }
        void deleteFromBeginning(){
            if(isEmpty())return;
          head=head.next;
        }
        void deleteFromLast(){
         if(isEmpty())return;
         node temp=head;
         while(temp.next.next!=null){
            temp=temp.next;
         }
         temp.next=null;
        }
        void insertAtAPoint(int data,int pos){
            node curr=new node(data);
            if(isEmpty()){
                head=curr;
                return;}
            node temp=head;
               int count=1;
               while(temp.next!=null)
               {
                temp=temp.next;
                count++;
                if(count==pos-1)break;
               }
        
            curr.next=temp.next;
            temp.next=curr;
        }
        void print()
        {
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
    
    public static void main(String[] args) {
        demo obj=new demo();
       System.out.println(obj.isEmpty());
       
        for(int i=0 ; i<7 ; i++)
        {
            obj.add(i);
        }
        obj.print();
        obj.insertBegin(45);
        System.out.println();
        obj.print();
        obj.insertEnd(69);
        System.out.println();
        obj.print();
        obj.deleteFromBeginning();
        System.out.println();
        obj.print();
        obj.deleteFromLast();
        System.out.println();
        obj.print();
        obj.insertAtAPoint(420, 4);
        System.out.println();
        obj.print();
   

    }
}
