import java.util.Scanner;

public class consecutive1inBinaryArray {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
       System.out.println("Enter the elements of the array");
       int a[]=new int[n];
       for(int i=0 ; i<n ; i++){
           a[i]=sc.nextInt();
       }
    sc.close();
    int max=maxOne(a,n);
    System.out.println(max);
    }
    // Brute Force
    public static int bruteForce(int a[],int n)
    {
        int res=Integer.MIN_VALUE;
        for(int i=0 ; i<n; i++)
        {
            int count=0;
            for(int j=i;  j<n ; j++)
            {
                if(a[j]==1)count++;
                else break;
            }

            res=Integer.max(res,count);
        }
        return res;
    }
    public static int maxOne(int a[],int n)
    {
        int res=0,curr=0;
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]==0)curr=0;
            else
            {
                curr++;
                res=Integer.max(res,curr);
            }
        }
        return res;
    }
}
