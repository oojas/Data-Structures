package Stack;

import java.util.ArrayDeque;

import java.util.Scanner;

public class nextGreater {
     public static void main(String s[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the array");
         int n=sc.nextInt();
         System.out.println("Enter the elements of the array");
         int a[]=new int[n];
         for(int i=0 ; i<n ; i++)
         {
             a[i]=sc.nextInt();
         }
         sc.close();
         printnextgreater(a);
     }    
     public static void printnextgreater(int a[])
     {
        
         ArrayDeque<Integer> s=new ArrayDeque<>();
         int b[]=new int[a.length];
        b[b.length-1]=-1;
        int j=b.length-2;
         s.push(a.length-1);
         for(int i=a.length-2 ; i>=0 ; i--)
         {
             while(s.isEmpty()==false&& a[s.peek()]<=a[i])
             {
                 s.pop();
             }
             if(s.isEmpty())
             {
               b[j]=-1;
             }
             else
             {
               b[j]=a[s.peek()];
             }
             s.push(i);
             j--;
           
         }
        
        for(int i=0 ; i<b.length ; i++)
        {
          System.out.print(b[i]+" ");
        }

     }
}
