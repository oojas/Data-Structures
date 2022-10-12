import java.util.Scanner;

public class occurancefirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
         a[i]=sc.nextInt();
        } 
        int x=sc.nextInt();
        sc.close();
        int val=efficientBinary(a,n,x);
        System.out.println(val);
    }
    static int efficientBinary(int a[],int n,int x)
    {
        int s=0,e=n-1;
        int ans=-1;
        while(s<=e)
        {
         int mid=(s+e)/2;
         if(a[mid]==x)
         {
           ans=mid;
           e=mid-1;
           continue;
         }
         if(a[mid]>x)
         {
            e=mid-1;

         }
         if(a[mid]<x)
         {
            s=mid+1;
         }
        }
        return ans;
    }
}
