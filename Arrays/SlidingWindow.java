import java.util.Scanner;

public class SlidingWindow {
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
        System.out.println("Enter the limit");
        int k=sc.nextInt();
        sc.close();
        int val=windowSlide(a,n,k);
        System.out.println(val);
    }
    // Niave solution has time complexity of O((n-k)k)
    // Window slide solution contains time complexity of O(n).
    public static int naiveSlide(int a[],int n,int k)
    {
          int max=Integer.MIN_VALUE;
          for(int i=0 ; i+k-1<n; i++)
          {   int sum=0;
            for(int j=0 ; j<k ; j++)
            {
             sum+=a[i+j];
            }
            max=Integer.max(max, sum);
          }
          return max;
    }
    public static int windowSlide(int a[],int n,int k)
    {
        int curr_sum=0;
        for(int i=0 ; i<k ; i++)
        {
            curr_sum+=a[i];
        }
        int max_sum=curr_sum;
        for(int i=k ; i<n ; i++)
        {
            curr_sum+=(a[i]-a[i-k]);
            max_sum=Integer.max(max_sum,curr_sum);
        }
        return max_sum;
    }

}
