import java.util.HashSet;
import java.util.Scanner;

public class zeroSum {
    public static void main(String args[])
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
        boolean val=zeroSumEfficient(a);
        System.out.println(val);
    }
    public static boolean bruteForce(int a[])
    {
        
        for(int i=0 ; i<a.length ; i++)
        { 
            int sum=a[i];
            for(int j=i+1 ; j<a.length ; j++)
            {
                sum+=a[j];
                if(sum==0)return true;
            }
        }
        return false;
    }
    public static boolean zeroSumEfficient(int a[])
    {
        int sum=0;
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0 ; i<a.length ; i++)
        {
            sum+=a[i];
            if(h.contains(sum))
            {
              return true;
            }
            if(sum==0)return true;
            h.add(sum);
        }
        return false;

    }
}
