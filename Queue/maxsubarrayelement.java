import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class maxsubarrayelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
  
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        findLarge(a,n,k);
        sc.close();
    }
    static void findLarge(int a[],int n,int k)
    {
        Deque<Integer> q=new LinkedList<>();
        for (int i = 0; i < k; ++i) {
            
            while (!q.isEmpty() && a[i] >= a[q.peekLast()])
                q.removeLast(); 

            
            q.addLast(i);
        }
        for (int i=k; i < n; i++) {
            
            System.out.print(a[q.peek()] + " ");

            
            while ((!q.isEmpty()) && q.peek() <= i - k)
                q.removeFirst();

           
            while ((!q.isEmpty()) && a[i] >= a[q.peekLast()])
                q.removeLast();

           
            q.addLast(i);
        }
        System.out.print(a[q.peek()]);
    }
}
