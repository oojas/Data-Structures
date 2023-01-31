import java.util.Scanner;

public class mincoinstoGetValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();

        }
        int v=sc.nextInt();
        sc.close();
       System.out.println(findMinCoin(a,n,v));
    }
    static int findMinCoin(int a[],int n, int v) // Recursive solution with time complexity more than o(n^3).
    {
        if(v==0)return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]<=v)
            {
              int sub_res=findMinCoin(a, n, v-a[i]);
              if(sub_res!=Integer.MAX_VALUE)
              {
                res=Integer.min(res, sub_res+1);
              }
            }
        }
        return res;
    }
}
