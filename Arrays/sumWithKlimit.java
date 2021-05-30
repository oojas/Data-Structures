import java.util.Scanner;


public class sumWithKlimit {
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
      System.out.println("Enter the sum");
      int sum=sc.nextInt();
      
      boolean val=findSum(a,n,k,sum);
      System.out.println(val);
      sc.close();
    }
    public static boolean findSum(int a[],int n, int k,int sum)
    {
        boolean isTrue=false;
        int curr_sum=0;
        for(int i=0 ; i<k ; i++)
        {
            curr_sum+=a[i];
        }
        if(curr_sum==sum)return true;
        for(int i=k ; i<n ; i++)
        {
            curr_sum+=(a[i]-a[i-k]);
            if(curr_sum==sum)
            {
                isTrue=true;
                break;
            }
        }
        return isTrue;
    }
}
