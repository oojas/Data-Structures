import java.util.Scanner;

public class algo {
    public static void main(String sp[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int val=maxSum(a,n);
        System.out.println(val);
    }
    public static int maxSum(int a[], int n)
    {
        int res=a[0];
        int maxEnding=a[0];
        for(int i=1 ; i<n ; i++)
        {
            maxEnding=Integer.max(maxEnding+a[i], a[i]);
            res=Integer.max(maxEnding,res);
        }
        return res;
    }
}
