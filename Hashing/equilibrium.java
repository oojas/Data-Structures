
import java.util.Scanner;

public class equilibrium {
    public static void main(String[] args) {
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
        boolean check=findEQ(a);
        System.out.println(check);
    }
    public static boolean findEQ(int a[])
    {
        int sum=0;
        for(int i=0 ; i<a.length ; i++)
        {
            sum+=a[i];
        }  
       int left_sum=0;
       for(int i=0 ; i<a.length ; i++)
       {
           if(left_sum==sum-a[i])return true;
           left_sum+=a[i];
           sum-=a[i];
       }
       return false;
    }
}
