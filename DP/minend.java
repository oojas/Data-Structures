import java.util.Scanner;

public class minend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i<n ; i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(minStepsDP(a,n));
    }
    static int minStepsDP(int a[],int n)
    {
        int d[]=new int[n];
        d[0]=0;
        for(int i=1 ; i<n ; i++)
        {
            d[i]=Integer.MAX_VALUE;
        }
        for(int i=1 ; i<n ; i++)
        {

                for(int j=0 ; j<i ; i++)
                {
                    if(a[j]+j>=i)
                    {
                        if(d[j]!=Integer.MAX_VALUE)
                        d[i]=Math.min(d[i],d[j]+1);
                    }
                }
        }
        return d[n-1];
    }
    static int findSteps(int a[],int n)
    {
        if(n==1)return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0 ; i<n-1 ; i++)
        {
            if(a[i]+i>=n-1)
            {
                int sub_res=findSteps(a, i+1);
                if(sub_res!=Integer.MAX_VALUE)res=Math.min(res, sub_res+1);
            }
        }
        return res;
    }
}
