import java.util.Scanner;

public class arrayImp {
    int capacity;
    int lastFilled;
    int a[];
    arrayImp(int capacity){
      this.capacity=capacity;
      lastFilled=-1;
      a=new int[capacity];
    }

    void push(int data){
       if(isEmpty())
       {
        lastFilled++;
        a[lastFilled]=data;
        return;
       }
       lastFilled++;
       a[lastFilled]=data;
    }
    boolean  isEmpty(){
        return lastFilled==-1;
    }
    int pop(){
        int temp=a[lastFilled--];
        return temp;
    }
    int peek(){
        return a[lastFilled];
    }
    void print(){
        if(isEmpty())return;
        for(int i=0 ; i<lastFilled+1 ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arrayImp obj=new arrayImp(n);
        for(int i=0 ; i<n ; i++)
        {
            obj.push(i);
        }
        obj.print();
        System.out.println(obj.pop());
        obj.print();
    sc.close();

    }
}
