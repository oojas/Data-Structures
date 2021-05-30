import java.util.Scanner;

public class suminSuBArray {
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
      System.out.println("Enter the sum");
      int sum=sc.nextInt();
      sc.close();
    boolean val=findSum(a,n,sum);
      System.out.println(val);
    }
    public static boolean findSum(int a[],int n,int sum)
    {
        int curr_sum=a[0];
        int s=0;
        for(int i=1 ; i<n ; i++)
        {
                while(curr_sum>sum && s<i)
                {
                    curr_sum-=a[s];
                    s++;
                }
            if(curr_sum<sum)
            curr_sum+=a[i];
     if(curr_sum==sum)return true;
        }
        return curr_sum==sum;
    }
}
