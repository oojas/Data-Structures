

import java.util.Scanner;

public class kSmall {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the kth length");
        int k=sc.nextInt();
        int val=findElement(a,k);
        sc.close();
        System.out.println(val);
    }
    public static int findElement(int a[],int k)
    {
       int j=0;
       
       boolean visited[]=new boolean[a.length];
       while(k!=0)
       {
           int small=a[0];
           for(int i=1 ; i<a.length ; i++)
           {
               if(small>a[i]&& visited[i]!=true)
               {
                   small=a[i];
                   j=i;
               }
           }
           visited[j]=true;
           k--;
       }
       return a[j];
    }
}
