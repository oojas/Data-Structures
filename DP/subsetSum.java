import java.util.Scanner;

public class subsetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        subsetSum s=new subsetSum();
        sc.close();
        s.findSubsetDP(a, n, k);
    }
    void findSubsetDP(int arr[],int n ,int sum)
    {
        int dp[][]= new int[n+1][sum+1];

		for(int i=0; i<=n; i++) dp[i][0] = 1;
		for(int j=1; j<=sum; j++) dp[0][j] = 0;


		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=sum; j++)
			{
				if(j < arr[i-1])
					dp[i][j] = dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j] + dp[i][j - arr[i-1]];
			}	
		}
        System.out.println(dp[n][sum]);
    }
    int findSet(int a[],int n,int k)
    {
        if(n==0)
        return (k==0)?1:0;
        return findSet(a, n-1, k)+findSet(a, n-1, k-a[n-1]);
    }
}
