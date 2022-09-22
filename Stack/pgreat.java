import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class pgreat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0 ; i<n ; i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        findPreviousGreat(a,n);
    }
 static void findPreviousGreat(int a[],int n)
    {
      Deque<Integer> m=new ArrayDeque<>();
      m.push(a[0]);
      System.out.print(-1+" ");
      for(int i=1 ; i<n ; i++)
      {
        while(m.isEmpty()==false && m.peek()<=a[i])m.pop();
        if(m.isEmpty())System.out.print(-1+" ");
        else System.out.print(m.peek()+" ");
        if(i!=n-1 && a[i+1]<a[i])m.push(a[i]);
      }
    }
    
}
