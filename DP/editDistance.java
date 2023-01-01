import java.util.Scanner;

public class editDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
        System.out.println(findMinOperationsDP(s1,s2,s1.length(),s2.length()));

    }
    static int findMinOperations(String s,String t, int m, int n) // Naive recursion with exponential time complexity.
    {
        if(n==0)return m;
        if(m==0)return n;
        if(s.charAt(m-1)==t.charAt(n-1))return findMinOperations(s, t, m-1, n-1);
        else
        return 1+ Integer.min(Integer.min(findMinOperations(s, t, m, n-1), findMinOperations(s, t, m-1, n)), 
        findMinOperations(s, t, m-1, n-1));
    }
    static int findMinOperationsDP(String s, String t, int n, int m)
    {
        int d[][]=new int[n+1][m+1];
        for(int i=0 ; i<=n ; i++)
        {
            d[i][0]=i;
        }
        for(int i=0 ; i<=m ; i++)
        {
            d[0][i]=i;
        }
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=m ; j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                d[i][j]=d[i-1][j-1];
                else
                d[i][j]=1+Integer.min(Integer.min(d[i-1][j-1], d[i-1][j]),d[i][j-1]);
            }
        }
        return d[n][m];
    }
}
