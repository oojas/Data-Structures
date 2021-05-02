import java.util.Scanner;

public class waterHoldingContainer {
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
        int val=max(a,n);
        sc.close();
        System.out.println(val);
    }
    //Solving the problem using two pointer alogrithm.
    public static int max(int a[],int n)
    {
        int max=0;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int diff=j-i;
         int v=0;
         if(a[i]<a[j])
         {
            v=a[i]*diff;
            i++;
         }
         else
         {
             v=a[j]*diff;
             j--;
         }
         if(max<v)
         {
             max=v;
         }
        }
        return max;
    }
}
