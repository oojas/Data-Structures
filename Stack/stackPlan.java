package Stack;

import java.util.ArrayDeque;
import java.util.Scanner;

public class stackPlan {
    public static void main(String s[])
    {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements ");
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
       spanPrint(a);
        
    }
    // Better solution as the time complexity is O(n).
    public static void spanPrint(int a[])
    {
        ArrayDeque<Integer> s=new ArrayDeque<Integer>();
        s.push(0);
        int span=1;
        System.out.print(span+" ");
        for(int i=0 ; i<a.length; i++)
        {
               while(s.isEmpty()==false&& a[s.peek()]<=a[i])
               {
                   s.pop();
               }
               if(s.isEmpty())
               {
                   span=i+1;
               }
               else
               {
                   span=i-s.peek();
               }
               System.out.print(span+" ");
               s.push(i);
        }
    }
    // Here the time complexity is O(n2)
    public static void plan(int a[])
    {
        for(int i=0 ; i<a.length  ; i++)
        {
            int span=1;
            for(int j=i-1 ; j>=0&& a[j]<=a[i] ;j-- )
            {
                span++;
            }
            System.out.print(span+" ");
        }
    }
}
