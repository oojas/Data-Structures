import java.util.Arrays;
import java.util.Scanner;

public class maxCut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       System.out.println(findMaxCutDP(n,a,b,c)); 
       sc.close();
    }
    static int findMaxCut(int n,int a,int b,int c) //recursive solution with exponential time complexity o(3^n)
    {
        if(n==0)return 0;
        if(n<0)return -1;
        int res=Math.max(findMaxCut(n-a, a, b, c),Math.max(findMaxCut(n-b, a, b, c), findMaxCut(n-c, a, b, c)));
       if(res==-1)return -1;
       else return res+1;
    }
    static int findMaxCutDP(int n,int a,int b,int c)
    {
        int d[]=new int[n+1];
        Arrays.fill(d, -1);
        for(int i=0 ; i<=n ; i++)
        {
            if(i==a || i==b || i==c)d[i]=1;
            if(i>=a && d[i-a]!=-1)d[i]=Math.max(d[i],d[i-a]+1);
            if(i>=b && d[i-b]!=-1)d[i]=Math.max(d[i], d[i-b]+1);
            if(i>=c && d[i-c]!=-1)d[i]=Math.max(d[i], d[i-c]+1);
        }
        return (d[n]==-1)?-1:d[n];
        }
}
