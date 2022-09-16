import java.util.Scanner;

public class evenOdd {
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
    void add(int data){
        node curr=new node(data);
        if(isEmpty()){
            head=curr;
            return;
        }
        node temp=head;
        while(temp.next!=null)temp=temp.next;
        temp.next=curr;
        return;
    }
    void print(){
        if(isEmpty())return;
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void modifyEven(){
        if(isEmpty())return;
        node os=null,oe=null,es=null,ee=null;
        for(node curr=head; curr!=null ; curr=curr.next){
            int x=curr.data;
            if(x%2==0)
            {
                if(es==null)es=ee=curr;
                else{
                    ee.next=curr;
                    ee=curr;
                }
            }
            else{
                if(os==null)os=oe=curr;
                else{
                    oe.next=curr;
                    oe=curr;
                }
            }
        }
        if(es==null|| os==null)return;
        ee.next=os;
        oe.next=null;
    }
    void swap(){
        if(isEmpty())return;
        node prev=head;
        node curr=head.next;
        while(curr!=null)
        {
            node temp=curr.next;
            curr.next=prev;
            prev.next=temp;
            curr=temp;
            prev=prev.next;
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        evenOdd obj=new evenOdd();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            obj.add(sc.nextInt());
        }
       sc.close();
        obj.swap();
        obj.print();

    }
}
