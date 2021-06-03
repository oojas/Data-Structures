import java.util.Scanner;
import java.util.HashSet;
public class subarraySum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum");
        int sum=sc.nextInt();
        sc.close();
        boolean check=checkSum(a,sum);
        System.out.println(check);
    }
    public static boolean checkSum(int a[],int sum)
    {
        HashSet<Integer> h=new HashSet<Integer>();
        int val=0;
        for(int i=0 ; i<a.length ; i++)
        {
             val+=a[i];
            if(h.contains(val-sum))return true;
            h.add(val);
        }
        return false;
    }
}