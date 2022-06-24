import java.util.Scanner;

public class eq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
 
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        boolean val=FindEquilibrium(a,n);
        System.out.print(val);
    }
    static boolean FindEquilibrium(int a[],int n){
          int left_sum=0;
          int sum=FindSum(a,n);
          for(int i=0 ; i<n ; i++)
          {
            if(left_sum==sum-a[i])return true;
            else{
                left_sum+=a[i];
                sum-=a[i];
            }
            
          }
          return false;
    }
    static int FindSum(int a[],int n){
        int sum=0;
        for(int i=0 ;i<n ; i++)
        {
            sum+=a[i];
        }
        return sum;
    }
}
