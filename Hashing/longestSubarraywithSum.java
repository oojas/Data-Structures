import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class longestSubarraywithSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum");
        int sum=sc.nextInt();
        int longArray=findLong(a,sum);
        sc.close();
        System.out.println(longArray);
    }
    // when a[i]>0
    public static int findLong(int a[],int sum)
    {
        if(sum==0)
        {
            int count=0;
            HashSet<Integer> h=new HashSet<Integer>();
            HashSet<Integer> m=new HashSet<Integer>();
        for(int i=0 ; i<a.length ; i++)
        {
            sum+=a[i];
            count++;
            if(h.contains(sum))
            {
              m.add(count-1);
              count=0;
              sum=0;
            }
            if(sum==0){
                m.add(count);
                count=0;
                sum=0;}
            h.add(sum);
        }
        if(m.isEmpty())return 0;
        int large=Integer.MIN_VALUE;
       Iterator<Integer> i=m.iterator();
       while(i.hasNext())
       {
           int val=i.next();
           if(large<val)
           {
               large=val;
           }
       }
       return large;
        
        }
        HashSet<Integer> h=new HashSet<Integer>();
      int findSum=a[0];
      int start=0;
      int count=1;
      for(int i=1 ; i<a.length ; i++)
      {
        while(findSum>sum && start<i)
        {
            findSum-=a[start];
            start++;
            count--;
        }
        if(findSum==sum)
         {
          h.add(count);
          count=0;
          findSum=0;
         }
         if(findSum<sum)
         {
             findSum+=a[i];
             count++;
         }
      }
      if(h.isEmpty())
      return 0;
      int large=Integer.MIN_VALUE;
       Iterator<Integer> i=h.iterator();
       while(i.hasNext())
       {
           int val=i.next();
           if(large<val)
           {
               large=val;
           }
       }
       return large;

    }
}
