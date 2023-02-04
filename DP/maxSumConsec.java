import java.util.Arrays;
import java.util.Scanner;

public class maxSumConsec {
   static int m[];
    public static void main(String[] args) {
        maxSumConsec con=new maxSumConsec();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        m=new int [n+1];
        Arrays.fill(m,-1);
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(con.maxSumDP(a,a.length));
        sc.close();
    }
    int maxSum(int a[],int n)
    {
      if(n==1)return a[0];
      if(n==2)return Integer.max(a[0],a[1]);
      return Math.max(maxSum(a, n-1),maxSum(a, n-2)+a[n-1]);
    }
    int maxSumDP(int a[],int n)
    {
        if(n==1)return a[0];
       int d[]=new int[n+1];
       d[1]=a[0];
       d[2]=Math.max(a[0],a[1]);
       for(int i=3 ; i<=n ; i++)
       {
        d[i]=Math.max(d[i-1],a[i-1]+d[i-2]);
       }
       return d[n];
    }
}
