import java.util.Scanner;

public class binarysearch {
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
    static int searchBinary(int a[],int n, int x)
    {
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]==x)return i+1;
        }
        return -1;
    }
    static int efficientBinary(int a[],int n,int x)
    {
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==x)return mid;
            if(a[mid]>x)
            {
                e=mid-1;
            }
            if(a[mid]<x)
            {
                s=mid+1;
            }
        }
        return -1;
    }
}
