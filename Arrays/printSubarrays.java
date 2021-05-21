import java.util.Scanner;

public class printSubarrays {
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int a[]=new int[n];
        for(int i=0;  i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        printSubArray(a,n);
    }
    public static void printSubArray(int a[],int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                for(int k=i ; k<=j ; k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
