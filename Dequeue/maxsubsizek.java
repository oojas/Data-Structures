import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class maxsubsizek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        findLargeinK(a,n,k);
 sc.close();
    }
   static void findLargeinK(int a[],int n,int k)
    {
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0 ; i<k ; i++)
        {
            while(!q.isEmpty() && a[i]>=a[q.peekLast()])q.removeLast();
            q.addLast(i);
        }
        for(int i=k ; i<n ; i++)
        {
            System.out.print(a[q.peekFirst()]+" ");
            while(!q.isEmpty() && q.peekFirst()<=i-k)q.removeFirst();
            while(!q.isEmpty()&& a[i]>=a[q.peekLast()])q.removeLast();
            q.addLast(i);
        }
        System.out.println(a[q.peekFirst()]);
    }
}
