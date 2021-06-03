import java.util.Scanner;
import java.util.HashSet;
public class findSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum");
        int k=sc.nextInt();
        boolean val=findEfficiently(a,k);
        System.out.println(val);
        sc.close();
    }
    public static boolean find(int a[],int n,int k)
    {
        int sum=0;
        for(int i=0  ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                sum=0;
               sum+=a[i]+a[j];
               if(sum==k)
               {
                return true;
               }
            }
        }
        return false;

    }
    public static boolean findEfficiently(int a[],int k)
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int x:a)
        {
            if(h.contains(k-x))
            {
                return true;
            }

         else{
             h.add(x);
         }
        }
        return false;
    }
}
