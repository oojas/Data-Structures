import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class visibleBoxes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int val=findMin(a,n);
       System.out.println(val);
        
    }
    public static int findMin(int a[],int n)
    {
      Queue<Integer> q=new LinkedList<Integer>();
      q.add(a[0]);
      for(int i=1 ; i<n ; i++)
      {
          int now=q.element();
          if(a[i]>=now*2)q.remove();
          q.add(a[i]);
      }
      return q.size();
    }
}
