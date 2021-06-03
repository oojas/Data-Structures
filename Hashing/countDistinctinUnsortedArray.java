import java.util.Scanner;
import java.util.HashSet;
public class countDistinctinUnsortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n=sc.nextInt();
        System.out.println("Enter the size of the second array");
        int m=sc.nextInt();
        System.out.println("Enter the elements of the first array");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the second array");
        int b[]=new int[m];
        for(int i=0 ; i<m ; i++)
        {
           b[i]=sc.nextInt();
        }
        sc.close();
        int val=count(a,b);
        System.out.println(val);
    }
    public static int count(int a[],int b[])
    {
       HashSet<Integer> h=new HashSet<Integer>();
       for(int x:a)
       {
           h.add(x);
       }
       for(int x:b)
       {
           h.add(x);
       }
       return h.size();
    }
}
