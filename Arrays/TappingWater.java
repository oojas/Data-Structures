import java.util.Scanner;

public class TappingWater {
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
        int val=maxWater(a,n);
        System.out.println(val);
    }
    public static int maxWater(int a[],int n)
    {
        int left_max[]=new int[n];
         int right_max[]=new int[n];
         left_max[0]=a[0];
         right_max[n-1]=a[n-1];
         for(int i=1 ; i<n ; i++)
         {
            left_max[i]=Integer.max(left_max[i-1], a[i]);
         }
         for(int i=n-2; i>=0 ; i--)
         {
            right_max[i]=Integer.max(right_max[i+1], a[i]);
         }
         int res=0;
         for(int i=0 ; i<n ; i++)
         {
            res=res+(Integer.min(left_max[i],right_max[i])-a[i]);
         }
         return res;
    }
}
