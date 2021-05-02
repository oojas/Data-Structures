import java.util.ArrayList;
import java.util.Scanner;

public class takenegativefirst {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        reset(a);
        sc.close();
       }
       public static void reset(int a[])
       {
           int j=0;
           ArrayList<Integer> arr=new ArrayList<Integer>();
           
           int b[]=new int[a.length];
           for(int i=0 ; i<a.length ; i++)
           {
               if(a[i]<0)
           {b[j]=a[i];
               j++;}
               else
               arr.add(a[i]);
           }
           for(int i=0 ; i<arr.size() ; i++)
           {
               b[j]=arr.get(i);
               j++;
           }
           for(int i=0 ; i<b.length ; i++)
           {
               System.out.print(b[i]+" ");
           }
           
       }
}
