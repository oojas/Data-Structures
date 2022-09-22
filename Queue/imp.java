public class imp {
    int a[];
    int capacity;
    int rear=-1;
    imp(int cap){
        this.capacity=cap;
        a=new int[capacity];
    }
    void enqueue(int data)
    {
       rear++;
       a[rear]=data;
       return;
    }
    void dequeue(){
       for(int i=0 ; i<capacity-1 ; i++)
       {
        a[i]=a[i+1];
       }
       a[capacity-1]=0;
       rear--;
    }
    int getFront(){
        return a[0];
    }
    int getRear(){
        return a[rear];
    }
    void print()
    {
        for(int i=0 ; i<capacity ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        imp obj=new imp(10);
        for(int i=0 ; i<10 ; i++)
        {
            obj.enqueue(i);
        }
        obj.print();
        obj.dequeue();
        obj.print();
        System.out.println(obj.getRear());
        System.out.println(obj.getFront());
    }
}
