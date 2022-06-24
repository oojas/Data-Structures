import java.util.Scanner;
public class SUMFIND {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=sc.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        boolean val=FindSum(a,n,sum);
        System.out.print(val);
    }
    static boolean FindSum(int a[],int n,int sum){
      int curr_sum=0,j=0;
      for(int i=0 ; i<n ; i++)
      {   if(curr_sum==sum)return true;
         if(curr_sum+a[i]<sum)curr_sum+=a[i];
        if(curr_sum+sum>a[i])
        {
            curr_sum+=(a[i]-a[j]);
            j++;
        }
      }
      return false;
    }
}
