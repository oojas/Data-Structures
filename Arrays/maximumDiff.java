import java.util.Scanner;

public class maximumDiff {
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
       int val= checkMax(a,n);
       System.out.println(val);
    }
    public static int checkMax(int a[],int n)
    {
       int small=a[0];
       for(int i=1 ; i<n ; i++)
       {
         if(small>a[i])
         {
             small=a[i];
         }
       }
       int large=a[0];
       for(int i=1 ; i<n ; i++)
       {
           if(large<a[i])
           {
               large=a[i];
           }
       }
       return large-small;
    }
}
