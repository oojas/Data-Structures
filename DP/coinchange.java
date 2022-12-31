import java.util.Scanner;
public class coinchange {
   static int d[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        sc.close();
        d=new int[n+1][sum+1];
        System.out.println(findSum(a,a.length,sum,d));
    }
    static int findSum(int a[],int n,int s) // Naive recursion with exponential time complexity
    {
        if(s==0)return 1;
        if(s<0)return 0;
        if(n==0)return 0;
        int count=findSum(a, n, s-a[n-1]) + findSum(a, n-1, s);
        return count;
    }
    //DP implementation
    static int findSum(int a[],int n,int s, int d[][])
    {
         for(int i=0 ; i<=n ; i++)
         {
            d[i][0]=1;
         }
         for(int i=1 ; i<=n ; i++)
         {
            for(int j=1 ; j<=s ; j++)
            {
                 d[i][j]=d[i-1][j];
                 if(a[i-1]<=j)
                 {
                    d[i][j]+=d[i][j-a[i-1]];
                 }
            }
         }
         return d[n][s];

    }
}
